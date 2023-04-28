Feature: Inicio de Sesion
@PR-Mati-001
  Scenario: Validar inicio de sesion en mi servipag
    Given el usuario se encuentra en la pagina de servipag
    When el usuario presiona en boton Mi Servipag
    And el usuario ingreso rut y password
    Then el usuario puede ver su informacion
  @PR-Mati-002
  Scenario: Validar inicio de sesion en mi servipag fallido
    Given el usuario se encuentra en la pagina de servipag
    When el usuario presiona en boton Mi Servipag
    And el usuario ingreso rut y password
    Then se visualiza mensaje de error