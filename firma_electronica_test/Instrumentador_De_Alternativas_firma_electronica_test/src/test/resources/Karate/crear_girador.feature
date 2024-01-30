Feature: validate crear girador api

  Scenario: get
    Given url urlBase + usersPath
    When method GET
    Then status 200
    And match $..status 'pendiente consulta cliente'


  Scenario: get 
    Given url urlBase + usersPath
    When method GET
    Then status 200
    And match $..status contains 'pendiente crear girador'


  Scenario: Get users list and check value in field
    Given url urlBase + usersPath
    When method GET
    Then status 200
    And match $..status contains 'pendiente crear pagare'
