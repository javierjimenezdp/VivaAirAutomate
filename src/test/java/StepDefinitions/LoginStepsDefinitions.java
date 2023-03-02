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

    @And("^me dirijo al módulo 'iniciar sesion'$")
    public void loginBotton() {
        loginSteps.bottonLoggin();
    }

    @And("^valido que cargue el home de inicio de sesion$")
    public void validateHome() {
        loginSteps.validationHomeViva();
    }
    @When("^registro mi (.*) (.*) y le doy al boton de iniciar sesion$")
    public void setUser(String email, String password) {
        loginSteps.setUserProgile(email, password);
    }
    @Then("^carga el profile con información personal, de contacto, historial, etc.$")
    public void validateProfile() {
        loginSteps.validationProfileViva();
    }
}

