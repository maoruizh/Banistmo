Feature: verify entry to the listado creditos en mora screen
  Me as a certifier
  I need to log in a user
  to validate that he can enter the experience correctly

  Scenario Outline: verify entry to the listado creditos en mora screen
    Given that I entered the home page
    When I check the data
      | cedula   | tipo   |
      | <cedula> | <tipo> |
    Then I can see the following messages
      | subtituloListadoCreditos   | tipoObligacion   | numeroObligacion   | diasMora   | saldoMora   |
      | <subtituloListadoCreditos> | <tipoObligacion> | <numeroObligacion> | <diasMora> | <saldoMora> |

    Examples:
      | cedula  | tipo | subtituloListadoCreditos                               | tipoObligacion  | numeroObligacion | diasMora         | saldoMora   |
      | 8431834 | CC   | Tienes una nueva opción de pago para 1 de tus créditos | Libre inversion | Nº 2760298968    | 109 días de mora | $ 75.801,00 |