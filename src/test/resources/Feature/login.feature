Feature: Yo como usuario pasajero, deseo hacer una compra de un tiquete aereo
  @Stories @Scenario2
  Scenario Outline: Login exitoso en VivaAir
    Given como usuario frecuente de viva cree un nuevo user
    And me dirijo al módulo "registrarse ahora"
    And cuando cargue el formulario dinamico debere enviar un código de validación a mi email
    And abro una nueva pestaña, busco mi email, espero que cargue la página, accedo al email de verificación, copio el código y me dirijo nuevamente a la página de registro de Viva
    And ingreso <password>, <password2>, <nonbre>, <apellido>, <documento>, <genero>, <AAAA-MM-DD>, <celular>, <pais>, <estado>, <ciudad>, <direccion>
    And verifico que los terminos y condicione esten check, de lo contrario, marco la casilla
    When le doy clic a "crear" debo esperar mientras de procesa la informacion
    Then me redirecciona al profile del user en Viva

    Examples:
    |password|password2|nonbre|apellido|documento|genero|AAAA-MM-DD|celular|pais|estado|ciudad|direccion|
    |Testing123456.|Testing123456.|Javier|David|1093785891|M|1998/03/11|3165784528|Colombia|Antioquia|Medellin|Calle 49BB#82-31|
