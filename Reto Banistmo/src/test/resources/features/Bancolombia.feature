Feature: Bancolombia websites

Scenario: Accessing the Bancolombia websites
     Given Select go to Bancolombia
     And Select button Negocios
     And Select button Soliciones no financieras
     And Select button Herramientas
     And Select Gestionar las finanzas de mi negocio
     And Select Convertidor de tasas de interes tool
     And Select De tasa nominal a tasa efectiva
     When Input data to calculate the tasa nominal a tasa efectiva
     Then Validate the calculation result