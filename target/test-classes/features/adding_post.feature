@chrome

Feature: Post Featre, Test facebook posting feature
  
  Scenario: Login with incorrect password
   	Given I am on "https://www.facebook.com/" url
   	And I Enter "mabuzaid.automation@gmail.com" into facebook email field
   	And I Enter "Test@123" into facebook password field
    And I wait for 1 seconds
    And I click on "Log In" button   
    And I wait for 5 seconds
    And I write "Hello World" at post area
    When I click on facebbok "Share" button
    And I wait for 5 seconds
    And I am on "https://www.facebook.com/mabuzaid.automation.3" url
    And I wait for 5 seconds
    Then I should see "Hello World"