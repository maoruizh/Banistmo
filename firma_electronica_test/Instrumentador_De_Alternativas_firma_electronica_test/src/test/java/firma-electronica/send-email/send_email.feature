Feature: validate the sending of email with instructions for the signature

  Background:
    Given url 'https://filialesexterior-ext-qa.apps.ambientesbc.com'

  Scenario Outline:Change the status negotiation of the user <messageStatus>
    * def statusNegotiationBody = read('status-negotiation-body.json')
    Given path '/cobranza-digital/ms-signature-2/signature/update/negotiation/status'
    And request statusNegotiationBody
    When method POST
    Then status 200
    And match $.status == <messageStatus>

    Examples:
      | messageStatus                            |
      | 'Se actualizo los estados correctamente' |

  Scenario Outline:Send email and validate the next status message <statusNegotiation> <statusAlternatives>
    Given path '/cobranza-digital/ms-signature-2/signature/send-email'
    And request { 'documentNumber': <documentNumber>, 'documentType': <documentType> }
    When method POST
    Then status 200
    And match $.statusNegotiation == <statusNegotiation>
    And match $.statusAlternatives == <statusAlternatives>

    Examples:
      | documentNumber | documentType | statusEmail                         | statusNegotiation | statusAlternatives        |
      | 8431834        | 1            | 'Delivery was created successfully' | 'En proceso'      | 'Pendiente Firma cliente' |

  Scenario Outline: validate the state <statusDocument>
    Given path '/cobranza-digital/ms-signature-2/sign/consult/negotiation'
    And request { 'documentNumber': <documentNumber>, 'documentType': <documentType> }
    When method POST
    Then status 200
    And match $..statusAlternative contains <statusDocument>

    Examples:
      | documentNumber | documentType | statusDocument            |
      | 8431834        | 1            | 'Pendiente Firma cliente' |