Feature: check access to the listado creditos en mora detalle screen
  Me as a certifier
  I need to log in a user
  to validate that he can enter the experience correctly

  @Scenario1
  Scenario Outline: check access to the listado creditos en mora detalle screen
    Given that I entered the listado creditos en mora detalle screen with the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    When I can see the data to the listado creditos en mora detalle screen
    Then I validate the following messages to the listado creditos en mora detalle screen
      | cuotasPagadas   | cuotasVencidas   | diasEnMora   | teQuedanPorPagar   | inicioMora   | estasAca   |
      | <cuotasPagadas> | <cuotasVencidas> | <diasEnMora> | <teQuedanPorPagar> | <inicioMora> | <estasAca> |

    Examples:
      | cedula  | tipo | cuotasPagadas | cuotasVencidas       | diasEnMora       | teQuedanPorPagar | inicioMora           | estasAca |
      | 8431834 | CC   | 9             | 4 (109 días de mora) | 109 días de mora | $ 155.072,00     | noviembre 12 de 2023 | 109 días |