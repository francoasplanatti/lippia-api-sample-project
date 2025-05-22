package services;

import api.model.project.projectModel;
import com.crowdar.api.rest.Response;
import java.util.HashMap;
import java.util.Map;

public class ProjectService extends BaseService {

    public static Response get(String jsonName) {
        return get(jsonName, projectModel[].class, setParamsWithWorkspaceId());
    }

    public static Response getById(String jsonName) {
        return get(jsonName, projectModel.class, setParamsWithProjectId());
    }

    public static Response post(String jsonName) {
        return post(jsonName, projectModel.class, setParamsWithWorkspaceId());
    }

    public static Response delete(String jsonName) {
        return delete(jsonName, projectModel.class, setParamsWithProjectId());
    }

    protected static Map<String, String> setParamsWithProjectId() {
        Map<String, String> params = setParamsWithWorkspaceId();
        params.put("projectId", PROJECT_ID.get());
        return params;
    }
}