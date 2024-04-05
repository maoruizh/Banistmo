#author: crico@bancolombia.com.co

Feature: Validar the screen listado negociacion functioning

  Background:
    Given that entered to sign my documents with the correct username and password
      | cedula   | type |
      | 3223695  | cc   |

  @scenarionamelistadonegociacion
  Scenario Outline: Validate the name of the client
    When I enter to listado negaciacion
    Then I should be able to see mi name <name>

    Examples:
      | name     |
      | 'Andres' |


