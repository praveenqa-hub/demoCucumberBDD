Feature: Application Login

  Scenario: Admin Page Default Login
    Given User is on NetBanking Landing Page
    When User login with username "demoAdmin" and password "demo123" into the application
    Then Home Page is displayed
    And Cards are displayed

#Reusable

 Scenario: User Page Default Login
    Given User is on NetBanking Landing Page
   	When User login with username "demouser" and password "user@123" into the application
    Then Home Page is populated
    And Cards are displayed

 Scenario Outline: User Page Default Login
    Given User is on NetBanking Landing Page
   	When User login with username "<Username>" and password "<Password>" into the application combination
    Then Home Page is populated
    And Cards are displayed
    
  Examples:
  | Username	| 	Password 	|
  | demouser 	| 	demo@4123  	|
  | demo1user | 	demo@123  |