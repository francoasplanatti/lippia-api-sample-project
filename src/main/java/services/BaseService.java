package services;

import com.crowdar.api.rest.MethodsService;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BaseService extends MethodsService {
    private static final Properties props = new Properties();

    static {
        try (InputStream input = BaseService.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new RuntimeException("No se pudo encontrar config.properties");
            }
            props.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error cargando config.properties");
        }
    }

    // Variables parametrizadas
    public static final ThreadLocal<String> API_KEY = ThreadLocal.withInitial(() -> props.getProperty("api.key"));
    public static final ThreadLocal<String> ORGANIZATION_ID = ThreadLocal.withInitial(() -> props.getProperty("organization.id"));
    public static final ThreadLocal<String> WORKSPACE_ID = new ThreadLocal<>();
    public static final ThreadLocal<String> PROJECT_ID = new ThreadLocal<>();
    public static final ThreadLocal<String> CLIENT_ID = new ThreadLocal<>();

    // Valores por defecto
    public static final String DEFAULT_WORKSPACE_NAME = props.getProperty("default.workspace.name");
    public static final String DEFAULT_PROJECT_NAME = props.getProperty("default.project.name");
    public static final String DEFAULT_CLIENT_NAME = props.getProperty("default.client.name");

    // Métodos para construir parámetros
    protected static Map<String, String> setBasicParams() {
        Map<String, String> params = new HashMap<>();
        params.put("apikey", API_KEY.get());
        return params;
    }

    protected static Map<String, String> setParamsWithWorkspaceId() {
        Map<String, String> params = setBasicParams();
        params.put("workspaceId", WORKSPACE_ID.get());
        return params;
    }

    protected static Map<String, String> setParamsWithProjectId() {
        Map<String, String> params = setParamsWithWorkspaceId();
        params.put("projectId", PROJECT_ID.get());
        return params;
    }

    protected static Map<String, String> setParamsWithClientId() {
        Map<String, String> params = setParamsWithWorkspaceId();
        params.put("clientId", CLIENT_ID.get());
        return params;
    }

    protected static Map<String, String> setParamsWithOrganizationId() {
        Map<String, String> params = setBasicParams();
        params.put("organizationId", ORGANIZATION_ID.get());
        return params;
    }
}