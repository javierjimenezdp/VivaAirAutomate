package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject extends LoginWebBasePage{
    @FindBy(xpath = "//div[@class='bx-modal__btn-close-icon']")
    private WebElement closeMarketing;
    @FindBy(xpath = "//div[@class='bx-modal__btn-close-icon']")
    private WebElement closeMarketing1;
    @FindBy(xpath = "//div[@class='btn-blue login-btn']")
    private WebElement logginClic;
    @FindBy(xpath = "//div//h2[contains(text(),\" Iniciar sesión\")]")
    private WebElement validationHomeVive;
    @FindBy(xpath = "//div//input[@id=\"signInName\"]")
    private WebElement clicSetEmail;
    @FindBy(id = "signInName")
    private WebElement setEmail;
    @FindBy(xpath = "//div//input[@id=\"password\"]")
    private WebElement cliSetPassword;
    @FindBy(id = "password")
    private WebElement setPassword;
    @FindBy(id = "next")
    private WebElement clicNext;
    @FindBy(xpath = "//div//h2[@class=\"title-text --no-edit-btn\"]")
    private WebElement validationProfileViva;
    public boolean isPresentAdd() {
        return validarElemnentoPresente(closeMarketing, 5);
    }
    public void verificationPageViva() {
        closeMarketing1.click();
    }
    public void clicBottonLoggin() {
        logginClic.click();
    }

    public boolean validationHome() {
        esperaElemnento(validationHomeVive, 10);
        return validationHomeVive.isDisplayed();
    }

    public void sendKeysEmail(String email) {
        clicSetEmail.click();
        setEmail.sendKeys(email);
    }

    public void sendKeysPassword(String password) {
        //cliSetPassword.click();
        setPassword.click();
        setPassword.sendKeys(password);
    }

    public void clicLoggin() {
        clicNext.click();
        threadTest(5);
    }

    public boolean isVisibleProfile() {
        //esperaElemnento(validationProfileViva, 10);
        return isVisibleElement(validationProfileViva);
    }
}
