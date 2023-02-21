package Steps;

import PageObject.VivaPageObject;
import StepDefinitions.Hooks;

import javax.security.auth.login.Configuration;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class VivaSteps {
    VivaPageObject vivaPageObject;
    public VivaSteps() {
        this.vivaPageObject = new VivaPageObject();
        vivaPageObject.setDriver(Hooks.getDriver());
    }

    public void verification_page() throws IOException {
        Properties configuration = new Properties();
        configuration.load(  new FileInputStream("Configuration.properties"));
        Hooks.getDriver().get(configuration.getProperty("url"));
        if(vivaPageObject.isPresentAdd()){
            vivaPageObject.verificationPage();
        }
    }

    public void verification_fly() {
        vivaPageObject.verificationFly();
    }

    public void set_City(String origen, String destino, String diaIda, String diaVuelta) {
        vivaPageObject.sendKeysOrigen(origen);
        vivaPageObject.sendKeysDestino(destino);
        vivaPageObject.verificationTypePssg();
        vivaPageObject.clickPssg();
        vivaPageObject.sendKeysIda("20");
        vivaPageObject.sendKeysRegreso("19");
        vivaPageObject.clicContinue();
        vivaPageObject.verificationPage1();
    }

    public void set_package() {
        vivaPageObject.selectFlyOut();
        vivaPageObject.selectPacageOut();
        vivaPageObject.setPackageout();
        vivaPageObject.selectFlyCome();
        vivaPageObject.selectPackageCome();
        vivaPageObject.setPackageCome();
    }
    public void set_pssg(String nombre1, String apellido1, String tipoDoc1, String cc1, String pais1, String email, String cel, String nombre2, String apellido2, String tipoDoc2, String cc2, String pais2) {
        vivaPageObject.verificationPage2();
        vivaPageObject.sendKeysApellido1(apellido1);
        vivaPageObject.sendKeysNombre1(nombre1);
        vivaPageObject.sendKeysTipoDoc1(tipoDoc1);
        vivaPageObject.sendKeysCc1(cc1);
        vivaPageObject.sendKeysPais1(pais1);
        vivaPageObject.sendKeysEmail(email);
        vivaPageObject.sendKeysCel(cel);
        vivaPageObject.clickSave1();
        vivaPageObject.sendKeysNombre2(nombre2);
        vivaPageObject.sendKeysApellido2(apellido2);
        vivaPageObject.sendKeysTipoDoc2(tipoDoc2);
        vivaPageObject.sendKeysCc2(cc2);
        vivaPageObject.sendKeysPais2(pais2);
        vivaPageObject.clicSave2();
    }
    public void click_checkBox() {
        vivaPageObject.clicContinueSeats();
        vivaPageObject.clicPackageDefault();
        vivaPageObject.clicCheckBox1();
        vivaPageObject.clickCloseBox1();
        vivaPageObject.clicCheckBox2();
        vivaPageObject.clickCloseBox2();
        vivaPageObject.clicCheckBox3();
        vivaPageObject.clickCloseBox3();
        vivaPageObject.clicPayAll();
    }
    public void type_pay() {
        vivaPageObject.verificationBank();
    }

    public void set_infoPay(String banco, String direccion) {
        vivaPageObject.clicBank(banco);
        vivaPageObject.sendKeysBank(banco);
        vivaPageObject.clicAddres(direccion);
        vivaPageObject.sendKeysAddres(direccion);
        vivaPageObject.clicCheckBox4();
        vivaPageObject.clickCheckBox5();
        vivaPageObject.clickPayFinal();
    }

    public void verification_bank() {
        vivaPageObject.verificationWayPay();
    }

}
