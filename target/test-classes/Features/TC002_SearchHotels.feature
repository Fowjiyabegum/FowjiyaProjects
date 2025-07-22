
Feature: Explore Hotel Module
  Scenario Outline: Search hotels with all fields
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Fowjiya"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs |
      | fowjiyabegum92@gmail.com | Fowjiya@1992 | Karnataka | Bengaluru | Standard | 2025-07-13 | 2025-07-15 | 1-One | 1-One | 0 |

  Scenario Outline: Search hotels with mandatory fields
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Fowjiya"
    When User search hotel "<state>","<city>","<checkIn>","<check-out>","<No of Room>" and "<No of Adults>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName | password | state | city | checkIn | check-out | No of Room | No of Adults |
      | fowjiyabegum92@gmail.com | Fowjiya@1992 | Karnataka | Bengaluru | 2025-07-13 | 2025-07-15 | 1-One | 1-One |


  Scenario Outline: Search hotels without entering any fields
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Fowjiya"
    And User click Search button
    Then User should verify after search hotel error message "Please select state", "Please select city", "Please select Check-in date", "Please select Check-out date", "Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | userName | password |
      | fowjiyabegum92@gmail.com | Fowjiya@1992 |
