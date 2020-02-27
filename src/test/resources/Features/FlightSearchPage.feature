Feature: Booking an one way journey
Scenario Outline: selecting journey
Given user should be in Home page 
And navigate to book a login page "<UserName>", "<Pass>" 
When providing journey deails 
And click Book Now
Then Naviate to Flight Selectio Page

Examples:

|UserName|Pass|
|shiva27.rokz@gmail.com|wsxft0987|

Scenario: User should select Flight 
Given user should see available flight
When should select flight and types
And continue the booking
Then redirect to Extras page