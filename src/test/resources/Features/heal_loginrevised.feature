Feature: login without member id
@sanity @chrome @tag1 
Scenario Outline:
: user should be able to login without member id number 
Given user is on healthfirst home page
When user clicks on login
And user clicks on member portal from the dropdown menu
And user enter user name "<Username>"
And user enter password "<Password>"
And user clicks on login button
Then user clicks on skip for now
Then user clicks on no thanks
Examples: 
|Username    |Password|
|nikitanarula|17August@2023|