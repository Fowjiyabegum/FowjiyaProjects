
Feature: Login Module
	Scenario Outline: Verifying login with valid credentials
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Fowjiya"

    Examples: 
      | userName | password |
      | fowjiyabegum92@gmail.com | Fowjiya@1992 |
  
  Scenario Outline: Verifying login with registered username and invalid password
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify error message after login "Invalid credentials"

    Examples: 
      | userName | password |
      | fowjiyabegum92@gmail.com | Fowjiya  |
 
  Scenario: Verifying login without entering credentials
    Given User is on the OMR Branch hotel page
    When User click on login button
    Then User should verify error message after login "Please enter your registered Email Address'
  
  Scenario Outline: Verifying login with unregistered email and password
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify error message after login "User does not exist"

    Examples: 
      | User name | Password |
      | fiyamunna@gmail.com | Fowjiya@1992 |
	
  Scenario Outline: Verifying login with invalid email and password
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify error message after login "Email ID is invalid"

    Examples: 
      | User name | Password |
      | fowjiya  | fowjiya@123  |

