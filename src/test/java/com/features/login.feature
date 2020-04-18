Feature: Login

  @Test
  Scenario Outline: Login Functionality
    Given user navigates to the website "<platform>", "<browserName>", "<browserVersion>", "<url>"

    Examples: 
      | platform | browserName | browserVersion | url                        |
      | MAC      | Safari      |             10 | https://www.javatpoint.com |
      | WINDOWS  | chrome      |             80 | https://www.javatpoint.com |
      | WIN8     | firefox     |             75 | https://www.javatpoint.com |
