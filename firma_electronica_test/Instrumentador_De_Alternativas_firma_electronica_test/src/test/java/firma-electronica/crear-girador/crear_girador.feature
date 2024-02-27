#author: crico@bancolombia.com.co

Feature: validate crear girador api

  Background:
    Given url 'https://filialesexterior-ext-qa.apps.ambientesbc.com'

  Scenario Outline: change the negociation to <messageUpdateClient>
      Given path '/cobranza-digital/ms-signature-2/signature/update-client'
      And request { 'documentNumber': <documentNumber>, 'documentType': <documentType> }
      When method POST
      Then status 200
      * print response
      And match $.status == <messageUpdateClient>

      Examples:
      |documentNumber| messageUpdateClient                   | documentType |
      |4655107       | 'Se actualizo los datos correctamente'| 1            |

  Scenario Outline: change the negociation to <messageCreateSigner>
    Given path '/cobranza-digital/ms-signature-2/signature/create/signer'
    And request {"client":{"numDocumento": <documentNumber>}}
    When method POST
    Then status 200
    And match $..messageResponse contains <messageCreateSigner>

    Examples:
    |documentNumber| messageCreateSigner|
    |4655107       | ["SDL.SE.0169: El girador ya existe y se actualizo la informacion"]|

  Scenario Outline: validate the state <messageNeg>
    Given path '/cobranza-digital/ms-signature-2/sign/consult/negotiation'
    And request { 'documentNumber': <documentNumber>, 'documentType': <documentType> }
    When method POST
    Then status 200
    * print response.data.alternatives
    And match $..statusAlternative == <messageNeg>

    Examples:
      |documentNumber|documentType| messageNeg |
      |4655107       |1           | ["Pendiente por crear girador"]|


  Scenario Outline: create a new negociation <messageAdd>
    * def newNegociationBody = read('new-negociation-body.json')
    Given path '/cobranza-digital/ms-signature-2/signature/add'
    And request newNegociationBody
    When method POST
    Then status 200
    And match $.state contains <messageAdd>

    Examples:
    | messageAdd |
    | 'Negotiation created successful' |
