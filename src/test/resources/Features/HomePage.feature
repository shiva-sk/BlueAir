Feature: Booking from homepage

  Scenario Outline: login into the Account
    Given user has to be in homepage
    When providing login credentials "<username>" and "<password>"
    And click login button
    Then move to search homepage

    Examples: 
      | username               | password  |
      | shiva27.rokz@gmail.com | wsxft0987 |

  Scenario: providing journey details
    Given user hase to be in homepage
    When enter from and to
    And trip type
    And Date
    And passenger
    Then click continue

  Scenario: providing Flight details
    Given user hase to be in flight search page
    When choose travel options
    Then click continue
