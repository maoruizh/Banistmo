Feature: check access to the nuevas condiciones screen
  Me as a certifier
  I need to log in a user
  to validate that he can enter the experience correctly

  @Scenario1
  Scenario Outline: check access to the nuevas condiciones screen
    Given that I entered the nuevas condiciones screen with the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    When I can see the data to the nuevas condiciones screen
    Then I validate the following messages to the nuevas condiciones screen
      | tipoObligacion   | numeroObligacion   |
      | <tipoObligacion> | <numeroObligacion> |

    Examples:
      | cedula  | tipo | tipoObligacion  | numeroObligacion |
      | 8431834 | CC   | Libre inversion | Nº 2760298968    |


  @Scenario2
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

  @Scenario3
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
