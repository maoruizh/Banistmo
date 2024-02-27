#author

  Feature: Validate crear pagare Api

    Background:
      Given url 'https://filialesexterior-ext-qa.apps.ambientesbc.com'

    Scenario Outline: Change the status negotiation of the user <messageStatus>
      * def statusNegotiationBody = read('status-negotiation-body.json')
      Given path '/cobranza-digital/ms-signature-2/signature/update/negotiation/status'
      And request statusNegotiationBody
      When method POST
      Then status 200
      And match $.status == <messageStatus>

      Examples:
        | messageStatus |
        | 'Se actualizo los estados correctamente'|

    Scenario Outline: validate the api crear pagare with the status negotiation <messageStatusNegotiation>
      Given path '/cobranza-digital/ms-signature-2/signature/create-pagare'
      And request { 'documentNumber': <documentNumber>}
      When method POST
      Then status 200
      * print response
      And match $.statusNegotiation contains <messageStatusNegotiation>

      Examples:
        |documentNumber| messageStatusNegotiation     |
        |1032461516    | 'Proceso termino con exitoso'|

    Scenario Outline: validate the state negotiation <messageStatusAlternative>
      Given path '/cobranza-digital/ms-signature-2/sign/consult/negotiation'
      And request { 'documentNumber': <documentNumber>, 'documentType': <documentType> }
      When method POST
      Then status 200
      * print response
      And match $..statusAlternative contains <messageStatusAlternative>

      Examples:
        |documentNumber|documentType| messageStatusAlternative |
        |1032461516    |1           | ["Pendiente Pagare para firma"]|
