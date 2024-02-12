Feature: Application Login

@SmokeTest @Mortgage
 Scenario: User Page Default Login
    Given User is on NetBanking Landing Page
   	When User login with username "demouser" and password "user@123" into the application
    Then Home Page is populated
    And Cards are displayed

 @RegressionTest @NetBanking
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
   	When User login with username Username and password Password into the application combination
    Then Home Page is populated
    And Cards are displayed
    
  Examples:
  | Username	| 	Password 	|
  | 124				| 	1.2			  |
  | dhoni			| 	12433332  |