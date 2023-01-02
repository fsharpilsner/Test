Feature: Test POST method for shipment

  Background:
    * url 'https://run.mocky.io/v3/b6022638-9d0c-4c3d-9df5-ddaee8163b4e'
    * def payload = read("shipment.json")


  Scenario: Trigger payload using POST method and it should return 200
    When request payload
    Then method POST
    And status 200
