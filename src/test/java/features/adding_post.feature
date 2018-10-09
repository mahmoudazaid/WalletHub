@chrome
Feature: Login Feature
  Verify if user is able to Login in to the site
  
  Scenario: Login with incorrect password
   	Given I am on Home page
   	And I Enter "mabuzaid.automation@gmail.com" into email field
   	And I Enter "Test@123" into password field
    And I wait for 5 seconds
    And I click on "Log In" button    
    And I write "Hello World" at post area   