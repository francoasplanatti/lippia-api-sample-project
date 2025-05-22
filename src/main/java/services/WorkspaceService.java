package services;

import api.model.workspace.workspaceModel;
import com.crowdar.api.rest.Response;
import java.util.HashMap;
import java.util.Map;

public class WorkspaceService extends BaseService {

    public static Response get(String jsonName) {
        return get(jsonName, workspaceModel[].class, setBasicParams());
    }

    public static Response post(String jsonName) {
        return post(jsonName, workspaceModel.class, setBasicParams());
    }

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
}