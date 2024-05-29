Feature: check access to the listado creditos en mora screen
  Me as a certifier
  I need to log in a user
  to validate that he can enter the experience correctly

  @Scenario1
  Scenario Outline: check access to the listado creditos en mora screen
    Given that I entered the home page with the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    When I can see the data
    Then I validate the following messages
      | subtituloListadoCreditos   | tipoObligacion   | numeroObligacion   | diasMora   | saldoMora   | botonCambiar   |
      | <subtituloListadoCreditos> | <tipoObligacion> | <numeroObligacion> | <diasMora> | <saldoMora> | <botonCambiar> |

    Examples:
      | cedula  | tipo | subtituloListadoCreditos                               | tipoObligacion  | numeroObligacion | diasMora         | saldoMora   |
      | 8431834 | CC   | Tienes una nueva opción de pago para 1 de tus créditos | Libre inversion | Nº 2760298968    | 109 días de mora | $ 75.801,00 |

  @Scenario2
  Scenario Outline: check access to the listado creditos en mora  en proceso screen
    Given that I entered the home page with the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    When I can see the data
    Then I validate the following messages in creditos en mora en proceso screen
      | tipoObligacion   | numeroObligacion   | estado   |
      | <tipoObligacion> | <numeroObligacion> | <estado> |

    Examples:
      | cedula   | tipo | tipoObligacion  | numeroObligacion | estado     |
      | 36348139 | CC   | Libre inversion | Nº 2760164364    | En proceso |

  @Scenario3
  Scenario Outline: check the operation of the button en otro momento
    Given that I entered the home page with the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    When I click the button en otro momento
    Then I validate the following messages in salir screen
      | mensajeSalir   |
      | <mensajeSalir> |

    Examples:
      | cedula  | tipo | mensajeSalir                     |
      | 8431834 | CC   | ¿Estas seguro que quieres Salir? |

  @Scenario4
  Scenario Outline: check the operation of the button salir
    Given that I entered the home page with the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    When I click the button salir
    Then I validate the following messages in salir listado creditos screen
      | mensajeSalir   |
      | <mensajeSalir> |

    Examples:
      | cedula  | tipo | mensajeSalir                     |
      | 8431834 | CC   | ¿Estas seguro que quieres Salir? |