Feature: Yo como usuario pasajero, deseo hacer una compra de un tiquete aereo
  @Stories @Scenario2
  Scenario Outline: Login exitoso en VivaAir
    Given como usuario frecuente de viva cree un nuevo user
    And me dirijo al módulo 'iniciar sesion'
    And valido que cargue el home de inicio de sesion
    When registro mi <email> <password> y le doy al boton de iniciar sesion
    Then carga el profile con información personal, de contacto, historial, etc.

    Examples:
    |email|password|
    |jjimenezp@pibox.app|Testing123456.|
    |javierjimenezdp10@gmail.com|123456|
