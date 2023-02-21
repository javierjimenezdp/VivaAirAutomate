package StepDefinitions;

import Steps.LoginSteps;
import Steps.VivaSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class LoginStepsDefinitions {
    LoginSteps loginSteps;

    public LoginStepsDefinitions() {
        this.loginSteps = new LoginSteps();
    }

    @Given("^como usuario frecuente de viva cree un nuevo user$")
    public void verificationFlyPage() throws IOException {
        loginSteps.verification_pageViva();
    }

    @And("^me dirijo al módulo \"registrarse ahora\"$")
    public void loginBotton() {
        loginSteps.bottonLoggin();
    }

    @And("^cuando cargue el formulario dinamico debere enviar un código de validación a mi email$")
    public void logginGoogle() {
        loginSteps.bottonLogginGoogle();
    }
    @And("^abro una nueva pestaña, busco mi email, espero que cargue la página, accedo al email de verificación, copio el código y me dirijo nuevamente a la página de registro de Viva$")
    public void selectUser() {
        loginSteps.bottonUserGoogle();
    }
}

