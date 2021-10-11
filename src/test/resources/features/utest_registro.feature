Feature: Visit to Utest.com and register an user
@tag1
  Scenario: Visit to Utest.com, register an user and verify user registration
    Given Visit the website Utest.com
    When Click on JOIN TODA" button and fill form
    |First name   |Last name|Email address       |Month |Day |Year |Password            |Confirm password          |City                |Zip   |Country  |Brand|Model|OperativeSystem|
    |andres       |quintero |pipe10@hotmail.com   |August|13  |1995 |WA5rb6kSMtitD76AdLB^|WA5rb6kSMtitD76AdLB^      |El Carmen de Viboral|054030|Colombia |Apple|iPhone 8|iOS 15.0.1  |
    Then Verify user registration "Welcome to the world's largest community of freelance software testers!"