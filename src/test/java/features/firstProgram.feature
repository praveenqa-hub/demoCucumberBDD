Feature: Application Login

  Scenario: Admin Page Default Login
    Given User is on NetBanking Landing Page
    When User login into the application
    Then Home Page is displayed
    And Cards are displayed


