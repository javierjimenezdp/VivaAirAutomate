package PageObject;

import StepDefinitions.Hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.seleniumhq.jetty9.util.ssl.X509;
import sun.awt.motif.X11CNS11643;

import java.util.List;

public class VivaPageObject extends VivaWebBasePage{
    String SelectDate = "//div[contains(@class,'container__day')]//div[contains(@class,'calendar__date_picker') and (text()=' Replaceable ')]";
    String SelectBank = "//div[@class=\"form-group\"]//*[@id=\"bank\"]//option[contains(text(),'Replaceable')]";
    String SetCC= "//li[contains(text(),'Replaceable')]";
    String SetCountry = "(//li[contains(text(),'Replaceable')])[3]";
    @FindBy(xpath = "//div[@class=\"bx-modal__btn-close-icon\"]")
    private WebElement closeMarketing;
    @FindBy(xpath = "//div[@class='tabs__data tabs__data__primary']")
    private WebElement verificationWebSite;
    @FindBy(xpath = "//span[@class='check__selected']")
    private WebElement clicTypeFly;
    @FindBy(xpath = "//input[@id='station']")
    private WebElement clicOrigen;
    @FindBy(xpath = "//div[@class='station__input station__input--border']//input")
    private WebElement writeOrigen;
    @FindBy(xpath = "//span[@class='station__name']//div")
    private WebElement setOrigen;
    @FindBy(xpath = "(//div[@class='station__input station__input--border']//input)[2]")
    private WebElement setDestino;
    @FindBy (xpath = "(//div[@class='station__input station__input--border']//input)[2]")
    private WebElement writeDestino;
    @FindBy(xpath = "//span[@class='station__name']//div")
    private WebElement clicDestino;
    @FindBy(xpath = "//div[@class='passenger__wrapper__column']//span")
    private WebElement verificationPssg;
    @FindBy (xpath = "(//div[@class='passenger__wrapper__row-action d-flex align-items-center justify-content-center'])[2]")
    private WebElement clicAddPssg;
    @FindBy(xpath = "//div[@class='close']//button")
    private WebElement clicClose;
    @FindBy(xpath = "//div[@class='date_picker__input__img']//input")
    private WebElement clicIda;
    @FindBy(xpath = "(//div[@class='calendar__date_picker__container__day date low'])[112]")
    private WebElement setVueltaClic;
    @FindBy(xpath = "//span[text()='Continuar']")
    private WebElement clicContinue;
    @FindBy(xpath = "//span[text()='Buscar']")
    private WebElement clicSearch;
    @FindBy(xpath = "//div[@class='navigation__step flex-column justify-content-around']")
    private WebElement verificationFly;
    @FindBy(xpath = "//span[text()='Seleccionar']")
    private WebElement setFlyOut;
    @FindBy(xpath = "(//div[@class='title__main title__main__space'])[3]")
    private WebElement verificationPackage;
    @FindBy(xpath = "(//button//div[contains(text(),'¡Lo quiero!')])[2]")
    private WebElement verificationBottomSet;
    @FindBy(xpath = "//button[@id='booking-continue-btn']")
    private WebElement clickContinue;
    @FindBy(xpath = "//div[@class=\"bundle-suggestion__close-btn\"]")
    private WebElement closeMarketing2;
    @FindBy(xpath = "(//div//span[text()='Seleccionar'])[4]")
    private WebElement setFlyCome;
    @FindBy (xpath = "//div//div[text()='Combo Full']")
    private WebElement verificationPackageCome;
    @FindBy(xpath = "//div//div[text()=' ¡Lo quiero! ']")
    private WebElement setPackageCome;
    @FindBy(xpath = "//span[text()='Continuar']")
    private WebElement clickContinue2;
    @FindBy(xpath = "//div[@class=\"bundle-suggestion__close-btn\"]")
    private WebElement closeMarketing3;
    @FindBy(xpath = "//div//span[text()='Completa los campos solicitados']")
    private WebElement verificationPagePssg;
    @FindBy(id="tipo_identificacion1ADT")
    private WebElement clicTypeCc;
    @FindBy(id = "nombre1ADT")
    private WebElement clicSetName;
    @FindBy(xpath = "(//div[@class='wrapper']//input)[2]")
    private WebElement setLastName;
    @FindBy(xpath = "(//div[@class=\"filter__icon chevron down\"])")
    private WebElement clicListCountry;
    @FindBy(xpath = "(//div[@class=\"input_id\"]//input)[2]")
    private WebElement clicEmail;
    @FindBy(xpath = "//*[@id=\"telefono\"]")
    private WebElement clicTel;
    @FindBy(xpath = "//div[@class=\"wrapper\"]//button")
    private WebElement saveInfo;
    @FindBy(xpath = "(//div[@class=\"action-buttons mt-4 d-flex align-items-center justify-content-end w-100\"]//button)[2]")
    private WebElement continueSit;
    @FindBy(xpath = "//button[@class=\"switch switch-medium\"]")
    private WebElement acceptAleatory;
    @FindBy(id = "booking-continue-btn")
    private WebElement packageAletory;
    @FindBy(xpath = "//button//span[contains(text(),\"Pagar\")]")
    private WebElement continuePay;
    @FindBy(id = "identificacion1ADT")
    private WebElement setCC;
    @FindBy(xpath = "(//div[@class=\"on-off\"]//button)[3]")
    private WebElement checkBox1;
    //(//button[@class="switch switch-medium"])[1]
    @FindBy(xpath = "(//button[@class=\"switch switch-medium\"])[2]")
    private WebElement checkBox2;
    @FindBy(xpath = "//*[@id=\"booking-continue-btn\"]")
    private WebElement clickContinue3;
    @FindBy(xpath = "(//button[@class=\"switch switch-medium\"])[1]")
    private WebElement clickBox1;
    @FindBy(xpath = "//button[contains(text(),\"Actualizar\")]")
    private WebElement closeBox1;
    @FindBy(xpath = "(//button[@class=\"switch switch-medium\"])[2]")
    private WebElement clickBox2;
    @FindBy(xpath = "//button[contains(text(),\"Actualizar\")]")
    private WebElement closeBox2;
    @FindBy(xpath = "(//button[@class=\"switch switch-medium\"])[3]")
    private WebElement clickBox3;
    @FindBy(xpath = "//button[contains(text(),\"Actualizar\")]")
    private WebElement closeBox3;
    @FindBy(xpath = "//button[contains(text(),'Aceptar')]")
    private WebElement acceptCookies;
    @FindBy(xpath = "(//div[@class=\"booking__buttons --with-share-links justify-content-between\"]//button)[2]")
    private WebElement continuePay2;
    @FindBy(xpath = "(//div[@class=\"title_container\"])[2]")
    private WebElement verificationPagePay;
    @FindBy(xpath = "//div[@class=\"form-group\"]//select")
    private WebElement clicBank;
    @FindBy(id = "address")
    private WebElement setAddres;
    @FindBy(xpath = "(//div[@class=\"terms-conditions-policies\"])")
    private WebElement checkBox6;
    @FindBy(xpath = "(//div[@class=\"terms-conditions-policies\"])[2]")
    private WebElement checkBox7;
    @FindBy(id = "booking-continue-btn")
    private WebElement continueClic5;
    @FindBy(xpath = "(//*[@id=\"content\"]//p)[1]")
    private WebElement verificationNequi;
    public boolean isPresentAdd(){
        return validarElemnentoPresente(closeMarketing, 20);
    }
    public void verificationPage() {
        closeMarketing.click();
    }//verification_page
    public void verificationFly() {
        esperaElemnento(clicTypeFly, 10);
        clicTypeFly.click();
        acceptCookies.click();
    } //verification_fly
    public void sendKeysOrigen(String origen) {
        clicOrigen.click();
        esperaElemnento(writeOrigen, 10);
        writeOrigen.sendKeys(origen);
        threadTest(1);
        setOrigen.click();
    } //set_City

    public void sendKeysDestino(String destino) {
        setDestino.click();
        writeDestino.sendKeys(destino);
        threadTest(1);
        clicDestino.click();
    } //set_City
    public boolean verificationTypePssg() {
        threadTest(1);
        return verificationPssg.isDisplayed();
    }
    public void clickPssg() {
        //threadTest(2);
        //clicAddPssg.click();
        //threadTest(1);
        //clicClose.click();
    } //set_City
    public void sendKeysIda(String date) {
        clicIda.click();
        threadTest(5);
        List<WebElement> element = returnListElement(SelectDate, date);
        //JavascriptExecutor executor = (JavascriptExecutor) Hooks.getDriver();
        //executor.executeScript("document.body.style.zoom = '0.75'");
        threadTest(3);
        element.get(element.size()-2).click();
    } //set_City
    public void sendKeysRegreso(String dateOut) {
        threadTest(3);
        List<WebElement> element = returnListElement(SelectDate, dateOut);
        element.get(element.size()-1).click();
    } //set_City
    public void clicContinue() {
        clicSearch.click();
    } //set_City
    public boolean verificationPage1() {
        esperaElemnento(verificationFly, 10);
        return verificationFly.isDisplayed();
    }
    public void selectFlyOut() {
        scrollElement(setFlyOut);
        setFlyOut.click();
        threadTest(3);
    } //set_package

    public boolean selectPacageOut() {
        esperaElemnento(verificationPackage, 10);
        return verificationPackage.isDisplayed();
    } //set_package
    public void setPackageout() {
        scrollElement(verificationBottomSet);
        esperaElemnento(verificationBottomSet, 10);
        verificationBottomSet.click();
        clicContinue.click();
        esperaElemnento(closeMarketing2,10);
        closeMarketing2.click();
        threadTest(3);
    }
    public void selectFlyCome() {
        scrollElement(setFlyCome);
        threadTest(3);
        setFlyCome.click();
        threadTest(3);
    } //set_package
    public boolean selectPackageCome() {
        esperaElemnento(verificationPackageCome, 10);
        return verificationPackageCome.isDisplayed();
    } //set_package
    public void setPackageCome() {
        scrollElement(verificationPackageCome);
        verificationPackageCome.click();
        clickContinue2.click();
        //esperaElemnento(closeMarketing3, 10);
        //closeMarketing3.click();
    }//set_package
    public boolean verificationPage2() {
        esperaElemnento(verificationPagePssg, 10);
        return verificationPagePssg.isDisplayed();
    } //set_pssg

    public void sendKeysNombre1(String nombre1) {
        esperaElemnento(clicSetName, 10);
        clicSetName.click();
        clicSetName.sendKeys(nombre1);
    } //set_pssg

    public void sendKeysApellido1(String apellido1) {
        esperaElemnento(setLastName, 10);
        setLastName.click();
        setLastName.sendKeys(apellido1);
    } //set_pssg

    public void sendKeysTipoDoc1(String tipoDoc1) {
        clicTypeCc.click();
        WebElement element = returnElement(SetCC, tipoDoc1);
        element.click();
    } //set_pssg

    public void sendKeysCc1(String cc1) {
        setCC.click();
        setCC.sendKeys(cc1);
    } //set_pssg

    public void sendKeysPais1(String pais1) {
        clicListCountry.click();
        WebElement element = returnElement(SetCountry, pais1);
        element.click();
    } //set_pssg

    public void sendKeysEmail(String email) {
        clicEmail.click();
        esperaElemnento(clicEmail, 10);
        clicEmail.sendKeys(email);
    } //set_pssg

    public void sendKeysCel(String cel) {
        clicTel.click();
        clicTel.sendKeys(cel);
    } //set_pssg

    public void clickSave1() {
        saveInfo.click();
    } //set_pssg

    public void sendKeysNombre2(String nombre2) {
    } //set_pssg

    public void sendKeysApellido2(String apellido2) {
    } //set_pssg
    public void sendKeysTipoDoc2(String tipoDoc2) {
    }
    public void sendKeysCc2(String cc2) {
    } //set_pssg

    public void sendKeysPais2(String pais2) {
    } //set_pssg

    public void clicSave2() {
    } //set_pssg

    public void clicContinueSeats() {
        esperaElemnento(continueSit, 10);
        //scrollElement(continueSit);
        continueSit.click();
    } //click_checkBox
    public void clicPackageDefault() {
        esperaElemnento(packageAletory, 10);
        packageAletory.click();
        esperaElemnento(checkBox1, 10);
        scrollElement(checkBox1);
        //checkBox1.click();
        //checkBox2.click();
        //clickContinue3.click();
    } //click_checkBox

    public void clicCheckBox1() {
        //clickBox1.click();
    } //click_checkBox

    public void clickCloseBox1() {
       //closeBox1.click();
    } //click_checkBox

    public void clicCheckBox2() {
        //clickBox2.click();
    } //click_checkBox

    public void clickCloseBox2() {
        //closeBox2.click();
    } //click_checkBox

    public void clicCheckBox3() {
        //clickBox3.click();
    } //click_checkBox

    public void clickCloseBox3() {
        //closeBox3.click();
    } //click_checkBox

    public void clicPayAll() {
        scrollElement(continuePay2);
        esperaElemnento(continuePay2, 10);
        continuePay2.click();
    } //click_checkBox

    public boolean verificationBank() {
        esperaElemnento(verificationPagePay, 10);
        return verificationPagePay.isDisplayed();

    } //type_pay

    public void clicBank(String banco) {
        clicBank.click();
        WebElement element = returnElement(SelectBank, banco);
        element.click();
    } //set_infoPay

    public void sendKeysBank(String banco) {
    } //set_infoPay

    public void clicAddres(String direccion) {
        esperaElemnento(setAddres, 10);
        setAddres.click();
        setAddres.sendKeys(direccion);
    } //set_infoPay

    public void sendKeysAddres(String direccion) {
    } //set_infoPay

    public void clicCheckBox4() {
        checkBox6.click();
    } //set_infoPay

    public void clickCheckBox5() {
        checkBox7.click();
    } //set_infoPay

    public void clickPayFinal() {
        scrollElement(continueClic5);
        esperaElemnento(continueClic5, 10);
        continueClic5.click();
    } //set_infoPay

    public boolean verificationWayPay() {
        return verificationNequi.isDisplayed();
    } //verification_bank

}
