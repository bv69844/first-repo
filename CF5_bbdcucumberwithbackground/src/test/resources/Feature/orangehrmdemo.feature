Feature: validate orangehrm admin and timesheets

Background: login steps
Given I load the url "https://opensource-demo.orangehrmlive.com/"
Then  I enter "Admin" into element "txtUsername"
Then I enter "admin123" into element "txtPassword"
Then I click the element "//*[@name='Submit']"

@sanity @mohan
Scenario: validate adminscreen
Then I click the element "//b[text()='Admin']"
Then I enter "Aravind" into element "searchSystemUser[userName]"
Then I click the element "//*[@id='searchBtn']"


@smoke @mohan
Scenario: Validate timesheet
When I click the element "//span[contains(text(),'Timesheets')]"
And I click the element "//*[@name='time[employeeName]']"
Then I enter "Charlie" into element "time[employeeName]"
Then I click the element "//strong[contains(text(),'Charlie')]/.."
Then I click the element "//input[@id='btnView']"
