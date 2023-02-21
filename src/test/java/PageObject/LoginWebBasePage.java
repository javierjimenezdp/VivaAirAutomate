package PageObject;

import StepDefinitions.Hooks;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginWebBasePage extends PageObject {
    public void esperaElemnento(WebElement element, int time){
        new WebDriverWait(Hooks.getDriver(), time).until(ExpectedConditions.visibilityOf(element));
        threadTest(2);
    }
    public boolean validarElemnentoPresente(WebElement element, int time){
        try {
            new WebDriverWait(Hooks.getDriver(), time).until(ExpectedConditions.visibilityOf(element));
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public void threadTest(int time) {
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public WebElement returnElement(String xPath, String option){
        return element(By.xpath(xPath.replace("Replaceable",option)));
    }
    public List<WebElement> returnListElement(String xPath, String option) {
        return Hooks.getDriver().findElements(By.xpath(xPath.replace("Replaceable", option)));
    }
    public void scrollElement(WebElement element){
        ((JavascriptExecutor) Hooks.getDriver()).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
    }
}

