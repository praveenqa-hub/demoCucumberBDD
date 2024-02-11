Feature: Application Login

  Scenario: Admin Page Default Login
    Given User is on NetBanking Landing Page
    When User login with username "demoAdmin" and password "demo123" into the application
    Then Home Page is displayed
    And Cards are displayed

#Reusable

@SmokeTest
 Scenario: User Page Default Login
    Given User is on NetBanking Landing Page
   	When User login with username "demouser" and password "user@123" into the application
    Then Home Page is populated
    And Cards are displayed

 @RegressionTest
 Scenario Outline: User Page Default Login
    Given User is on NetBanking Landing Page
   	When User login with username "<Username>" and password "<Password>" into the application
    Then Home Page is populated
    And Cards are displayed
    
  Examples:
  | Username	| 	Password 	|
  | demouser 	| 	demo@4123 |
  | demo1user | 	demo@123  |
  
 	@SmokeTest @RegressionTest
  Scenario Outline: User Page Login
    Given User is on NetBanking Landing Page
   	When User login with username <Username> and password <Password> into the application combination
    Then Home Page is populated
    And Cards are displayed
    
  Examples:
  | Username	| 	Password 	|
  | 124				| 	1.2			  |
  | dhoni			| 	12433332  |
  
  Scenario: User Page Default Login
    Given User is on NetBanking Landing Page
   	When User login 
   	| rahul|
   	|shetty|
   	|demo|
   	|123|
   	
    Then Home Page is populated
    And Cards are displayed