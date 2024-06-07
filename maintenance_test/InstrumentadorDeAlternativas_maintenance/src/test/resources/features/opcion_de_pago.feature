Feature: check access to the opcion de pago screen
  Me as a certifier
  I need to log in a user
  to validate that he can enter the experience correctly

  @Scenario1
  Scenario Outline: check access to the opcion de pago screen
    Given that I entered the opcion de pago screen with the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    When I can see the data to the opcion de pago screen
    Then I validate the following messages to the opcion de pago screen
      | tipoObligacionYNumero   | fechaVencimiento   |
      | <tipoObligacionYNumero> | <fechaVencimiento> |

    Examples:
      | cedula  | tipo | tipoObligacionYNumero                    | fechaVencimiento                                       |
      | 8431834 | CC   | Crédito de libre inversion Nº 2760298968 | Esta opción la tienes disponible hasta junio 5 de 2026 |

  @Scenario2
  Scenario Outline: check the operation of the button salir
    Given that I entered the opcion de pago screen with the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    When I click on button salir opcion de pago
    Then I validate the following messages in salir listado creditos screen
      | mensajeSalir   |
      | <mensajeSalir> |

    Examples:
      | cedula  | tipo | mensajeSalir                     |
      | 8431834 | CC   | ¿Estas seguro que quieres Salir? |

  @Scenario3
  Scenario Outline: check the operation of the button volver
    Given that I entered the opcion de pago screen with the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    When I click on button volver in the opcion de pago screen
    Then I validate the following messages
      | subtituloListadoCreditos   | tipoObligacion   | numeroObligacion   | diasMora   | saldoMora   | botonCambiar   |
      | <subtituloListadoCreditos> | <tipoObligacion> | <numeroObligacion> | <diasMora> | <saldoMora> | <botonCambiar> |

    Examples:
      | cedula  | tipo | subtituloListadoCreditos                               | tipoObligacion  | numeroObligacion | diasMora         | saldoMora   |
      | 8431834 | CC   | Tienes una nueva opción de pago para 1 de tus créditos | Libre inversion | Nº 2760298968    | 109 días de mora | $ 75.801,00 |

  @Scenario4
  Scenario Outline: check the operation of the button aplazar mi pago screen
    Given that I entered the opcion de pago screen with the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    When I click on button aplazar mi pago
    Then I validate the following message in nuevas condiciones fecha screen
      | nuevaFechaPago   |
      | <nuevaFechaPago> |

    Examples:
      | cedula  | tipo | nuevaFechaPago               |
      | 8431834 | CC   | Elige tu nueva fecha de pago |

  @Scenario5
  Scenario Outline: check the operation of the button aplazar mi pago y disminuir mi cuota screen
    Given that I entered the opcion de pago screen with the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    When I click on button aplazar mi pago y disminuir mi cuota
    Then I validate the following message in nuevas condiciones cuota screen
      | nuevaCuotaMensual   |
      | <nuevaCuotaMensual> |

    Examples:
      | cedula  | tipo | nuevaCuotaMensual                            |
      | 8431834 | CC   | Elige la nueva cuota mensual que vas a pagar |

