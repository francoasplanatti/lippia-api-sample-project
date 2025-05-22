package services;

import api.model.client.clientModel;
import com.crowdar.api.rest.Response;
import java.util.HashMap;
import java.util.Map;

public class ClientService extends BaseService {

    public static Response get(String jsonName) {
        return get(jsonName, clientModel[].class, setParamsWithWorkspaceId());
    }

    public static Response post(String jsonName) {
        return post(jsonName, clientModel.class, setParamsWithWorkspaceId());
    }

    public static Response getById(String jsonName) {
        return get(jsonName, clientModel.class, setParamsWithClientId());
    }

    public static Response delete(String jsonName) {
        return delete(jsonName, clientModel.class, setParamsWithClientId());
    }

    protected static Map<String, String> setParamsWithClientId() {
        Map<String, String> params = setParamsWithWorkspaceId();
        params.put("clientId", CLIENT_ID.get());
        return params;
    }
}