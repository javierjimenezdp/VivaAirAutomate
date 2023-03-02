package Steps;

import PageObject.LoginPageObject;
import Reports.Reports;
import StepDefinitions.Hooks;
import org.junit.Assert;

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

    public void validationHomeViva() {
        loginPageObject.validationHome();
    }

    public void setUserProgile(String email, String password) {
        loginPageObject.sendKeysEmail(email);
        Reports.reports("INFO","Se ingresó el email",Reports.takeSnapShot(Hooks.getDriver()));
        loginPageObject.sendKeysPassword(password);
        Reports.reports("INFO","Se ingresó el password",Reports.takeSnapShot(Hooks.getDriver()));
        loginPageObject.clicLoggin();
    }

    public void validationProfileViva() {
        if (!loginPageObject.isVisibleProfile()){
            Reports.reports("FAIL","User no válido",Reports.takeSnapShot(Hooks.getDriver()));
            Assert.fail("User no valido");
        }
        Reports.reports("PASS","Se dio valida profile",Reports.takeSnapShot(Hooks.getDriver()));
    }
}
