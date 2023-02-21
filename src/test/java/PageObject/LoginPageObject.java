package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPageObject extends LoginWebBasePage{
    @FindBy(xpath = "//div[@class='bx-modal__btn-close-icon']")
    private WebElement closeMarketing;
    @FindBy(xpath = "//div[@class='bx-modal__btn-close-icon']")
    private WebElement closeMarketing1;
    @FindBy(xpath = "//div[@class='btn-blue login-btn']")
    private WebElement logginClic;
    @FindBy(xpath = "//button[text()='Google']")
    private WebElement googleClicLoggin;
    public boolean isPresentAdd() {
        return validarElemnentoPresente(closeMarketing, 5);
    }
    public void verificationPageViva() {
        closeMarketing1.click();
    }
    public void clicBottonLoggin() {
        logginClic.click();
    }
    public boolean isVisibleButtonGoogle(){
        return googleClicLoggin.isDisplayed();
    }
    public void logginGoogleClic() {
        esperaElemnento(googleClicLoggin, 10);
        googleClicLoggin.click();
    }
}
