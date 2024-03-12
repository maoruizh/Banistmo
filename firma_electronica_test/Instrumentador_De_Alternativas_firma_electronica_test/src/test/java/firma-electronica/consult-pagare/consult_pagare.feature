Feature: validate the consult of pagare pending signing

  Background:
    Given url 'https://filialesexterior-ext-qa.apps.ambientesbc.com'
    * configure ssl = true

  Scenario Outline:Change the status of negotiation to the <messageStatus>
    * def statusNegotiationBody = read('status-negotiation-body.json')
    Given path '/cobranza-digital/ms-signature-2/signature/update/negotiation/status'
    And request statusNegotiationBody
    When method POST
    Then status 200
    And match $.status == <messageStatus>

    Examples:
      | messageStatus                            |
      | 'Se actualizo los estados correctamente' |


  Scenario Outline:Create pagare and validate the status of negotiation <messageStatusNegotiation>
    Given path '/cobranza-digital/ms-signature-2/signature/create/pagare'
    And request { 'documentNumber': <documentNumber>}
    When method POST
    Then status 200
    * print response
    And match $.statusNegotiation contains <messageStatusNegotiation>

    Examples:
      | documentNumber | messageStatusNegotiation      |
      | 8431834        | 'Proceso termino con exitoso' |

  Scenario Outline:Consult pagare and validate the next status message <estadoAlternativa>
    Given path '/cobranza-digital/ms-signature-2/signature/consult/pagare'
    And request { 'tipoDocumento': <tipoDocumento>, 'cedulaCliente': <cedulaCliente>, 'tipoAlternativa': <tipoAlternativa>}
    When method POST
    Then status 200
    And match $.estadoAlternativa == <estadoAlternativa>

    Examples:
      | tipoDocumento | cedulaCliente | tipoAlternativa            | estadoAlternativa                |
      | 1             | 8431834       | 'Consolidacion de Pasivos' | 'Pendiente Correo Instrucciones' |
