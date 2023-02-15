Feature: Yo como usuario pasajero, deseo hacer una compra de un tiquete aereo
  @Stories @Scenario1
  Scenario Outline: Compra exitosa de un tiquete aereo
    Given Como usuario pasajero deseo hacer la búsquedad de un tiquete aereo
    And debo verificar que sea un vuelo de ida y vuelta
    And debo ingresar la ciudad de <origen>, el <destino>, <dia>, <vuelta> de la ciudad, la fecha de ida, la fecha de regreso y el número de pasajeros
    And debo seleccionar un vuelo con el tipo de equipaje de ida y seleccionar un vuelo con el tipo de equipaje de vuelta para continuar con la personalización del vuelo
    And debo ingresar <nombre1>, <apellido1>, <tipoDoc1>, <CC1>, <pais1>, <email>, <cel> del 1er pasajero, <nombre2>, <apellido2>, <tipoDoc2>, <CC2>, <pais2> del 2do pasajero
    And seleccionar asientos aleatorios, la maleta incluida por defecto y activar todos los servicios
    And al proceso de pago de los tiquetes, eligiendo PSE como metodo de pago
    When cargue la informacion PSE, debo ingresar <banco>, <direccion>, check a los checkbox y continuar
    Then debo comprobar que me redirija a el portal de pago de Nequi

    Examples:
      |origen|destino|dia|vuelta|nombre1|apellido1|tipoDoc1|CC1|pais1|email|cel|nombre2|apellido2|tipoDoc2|CC2|pais2|banco|direccion|
      |bogota|medellin|20|20|javier|jimenez|Cédula de extranjería|1093785891|Colombia|ing.javierdavidjp@gmail.com|3165784528|david|plata|CedulaDeCiudadania|60340698|Colombia|NEQUI|Calle 49BB#82-31|
