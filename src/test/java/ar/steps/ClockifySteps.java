package ar.steps;

import api.model.client.clientModel;
import api.model.project.projectModel;
import api.model.workspace.workspaceModel;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

import static services.BaseService.*;

public class ClockifySteps extends PageSteps {

    @Given("^tengo una apiKey correcta (.*)$")
    public void setApiKey(String apiKey) {
        API_KEY.set(apiKey);
    }

    @And("obtengo un id de workspace correcto")
    public void obtengoUnIdDeWorkspaceCorrecto() {
        workspaceModel[] response = (workspaceModel[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].id, "El ID del workspace es nulo");
        WORKSPACE_ID.set(response[0].id);
    }

    @And("obtengo un id de proyecto")
    public void obtengoUnIdDeProyecto() {
        projectModel[] response = (projectModel[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].id, "El ID del proyecto es nulo");
        PROJECT_ID.set(response[0].id);
    }

    @And("obtengo un id de cliente")
    public void obtengoUnIdDeCliente() {
        clientModel[] response = (clientModel[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].id, "El ID del cliente es nulo");
        CLIENT_ID.set(response[0].id);
    }
}