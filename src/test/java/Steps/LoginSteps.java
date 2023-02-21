package Steps;

import PageObject.LoginPageObject;
import PageObject.VivaPageObject;
import StepDefinitions.Hooks;
import groovy.util.logging.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginSteps {
    LoginPageObject loginPageObject;

    public LoginSteps() {
        this.loginPageObject = new LoginPageObject();
        loginPageObject.setDriver(Hooks.getDriver());
    }

    public void verification_pageViva() throws IOException {
        Properties configuration = new Properties();
        configuration.load(new FileInputStream("Configuration.properties"));
        Hooks.getDriver().get(configuration.getProperty("url"));
        if (loginPageObject.isPresentAdd()) {
            loginPageObject.verificationPageViva();
        }
    }
    public void bottonLoggin() {
        loginPageObject.clicBottonLoggin();
    }
    public void bottonLogginGoogle() {
        loginPageObject.logginGoogleClic();
        while (loginPageObject.isVisibleButtonGoogle()){
            loginPageObject.logginGoogleClic();
        }
    }
    public void bottonUserGoogle() {
    }
}
