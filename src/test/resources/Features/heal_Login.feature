Feature: Heal Log IN Feature
@skip
Scenario Outline: Verify User Login with Valid Credentials
Given User in on the CVS homepage
When I click on dropdown sign on 
And I click on sign in button 
Then I enter valid <Email Address>
And click continue
And I enter valid <Password>
Then I click submit button
Examples:
| Email Address                  | Password    |
| qa.barbie.oppenheimer@gmail.com| Success2023 |