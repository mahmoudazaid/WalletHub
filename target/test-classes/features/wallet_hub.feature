@chrome
Feature: Test Rating and review function
  
  Scenario: Check rating function
   	Given I am on "http://wallethub.com/profile/test_insurance_company/" url
   	And I wait for 5 seconds   
   	And I click on "Login" link
   	And I wait for 5 seconds   	
   	And I Enter "mabuzaid.automation@gmail.com" into "Email" field
   	And I Enter "Test@123" into "Password" field
   	And I click on "Login" WalletHub button
   	And I wait for 5 seconds   	    
   	And Rate the site by "5" stars
   	And I select "Health" from "Please select your policy" dropdownlist   	
   	And I write "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec q." into "Your Review" textarea   	
   	And I rate "5" as overall rate
   	When I click on "Submit" button
   	And I wait for 10 seconds   	    
   	Then I should see "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean"
   	Given I am on "https://wallethub.com/profile/mabuzaid/" url
   	And I wait for 5 seconds
   	And I click on "Reviews" link
   	And I wait for 5 seconds
   	Then I should see "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean"