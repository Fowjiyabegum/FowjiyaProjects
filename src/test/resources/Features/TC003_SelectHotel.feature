
Feature: Select Hotel Module

  Scenario Outline: Select first hotel
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Fowjiya"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User scrolls down, save the first hotel name and hotel price
    And User select the first hotel and click ok to proceed to next page
    Then User should verify after select success message "Book Hotel"

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs |
      | fowjiyabegum92@gmail.com | Fowjiya@1992 | Karnataka | Bengaluru | Standard | 2025-07-13 | 2025-07-15 | 1-One | 1-One | 0 |
      