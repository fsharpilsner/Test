Feature: Test GET method for Search Query Processing

  Background:
    * url 'https://run.mocky.io/v3/027b2899-9b1e-4b25-9121-a066beaf58c3'

  Scenario: GET method should return 200 and validate response message
    Given path '/api/shipment/search'
    And param query = '99110084'
    When method GET
    And status 200
    Then match response.data[0].shipmentStatus == 'Delivered'