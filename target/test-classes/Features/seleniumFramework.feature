Feature: Access seleniumFramework website
  @seleniumFramework
  Scenario Outline: Print Title,URL
    When i open seleniumframework "<URL>"
    Then i should validate "<title>" and "<validateURL>"

    Examples:
    | title | validateURL | URL |
    | Selenium, Cucumber, Ruby, Java et al. | http://www.seleniumframework.com/ | http://www.seleniumframework.com |
