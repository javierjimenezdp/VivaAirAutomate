package StepDefinitions;

import Steps.VivaSteps;
import cucumber.api.java.bs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import org.yecht.Data;

public class VivaStepsDefinitions {
    VivaSteps vivaSteps;
    public VivaStepsDefinitions() {
        this.vivaSteps = new VivaSteps();
    }

    @Given("^Como usuario pasajero deseo hacer la búsquedad de un tiquete aereo$")
    public void verificationFlyPage(){
        vivaSteps.verification_page();
    }
    @And("^debo verificar que sea un vuelo de ida y vuelta$")
    public void verificationTicket(){
        vivaSteps.verification_fly();
    }
    @And("^debo ingresar la ciudad de (.*), el (.*), (.*), (.*) de la ciudad, la fecha de ida, la fecha de regreso y el número de pasajeros$")
    public void setInfoFly(String origen, String destino, String dia, String vuelta){
        vivaSteps.set_City(origen,destino, dia, vuelta);
    }
    @And("^debo seleccionar un vuelo con el tipo de equipaje de ida y seleccionar un vuelo con el tipo de equipaje de vuelta para continuar con la personalización del vuelo$")
    public void selectPackage(){
        vivaSteps.set_package();
    }
    @And("^debo ingresar (.*), (.*), (.*), (.*), (.*), (.*), (.*) del 1er pasajero, (.*), (.*), (.*), (.*), (.*) del 2do pasajero$")
    public void setInfoPssg(String nombre1, String apellido1, String tipoDoc1, String CC1, String pais1, String email, String cel, String nombre2, String apellido2, String tipoDoc2, String CC2, String pais2){
        vivaSteps.set_pssg(nombre1, apellido1, tipoDoc1, CC1, pais1, email, cel, nombre2, apellido2, tipoDoc2, CC2, pais2);
    }
    @And("^seleccionar asientos aleatorios, la maleta incluida por defecto y activar todos los servicios$")
    public void checkBox(){
        vivaSteps.click_checkBox();
    }
    @And("^al proceso de pago de los tiquetes, eligiendo PSE como metodo de pago$")
    public void selectBank(){
        vivaSteps.type_pay();
    }

    @When("^cargue la informacion PSE, debo ingresar (.*), (.*), check a los checkbox y continuar$")
    public void setDataPay(String banco, String direccion){
        vivaSteps.set_infoPay(banco,direccion);
    }
    @Then("^debo comprobar que me redirija a el portal de pago de Nequi$")
    public void verificationPay(){
        vivaSteps.verification_bank();
    }
}
