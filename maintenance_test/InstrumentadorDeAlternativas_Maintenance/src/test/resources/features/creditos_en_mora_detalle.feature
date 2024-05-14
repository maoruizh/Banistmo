Feature: verify entry to the listado creditos en mora detalle screen
  Me as a certifier
  I need to log in a user
  to validate that he can enter the experience correctly

  Background:
    Given that entered with the correct data
      | cedula  | tipo |
      | 8431834 | cc   |

  Scenario Outline: verify entry to the listado creditos en mora detalle screen
    When I entered the to the listado creditos en mora screen and select the button doble flecha abajo
    Then I can see the following messages in listado creditos en mora detalle screen
      | comoEstaTuCredito   | cuotasPagadas   | cuotasVencidas   | teQuedanPorPagar   | estasAca   |
      | <comoEstaTuCredito> | <cuotasPagadas> | <cuotasVencidas> | <teQuedanPorPagar> | <estasAca> |

    Examples:
      | comoEstaTuCredito      | cuotasPagadas | cuotasVencidas | teQuedanPorPagar | estasAca  |
      | ¿Cómo está tu crédito? | 2             | 10             | 8285785858       | 68   dias |