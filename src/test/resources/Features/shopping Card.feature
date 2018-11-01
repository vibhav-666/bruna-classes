Feature: test e-commerce website

Background:
  Given i open the automationPractice website


  @e-commerce
  Scenario: Sign in and out

    And i sign in
    Then i sign out

  @ContactUs
  Scenario Outline: Validate contact us page

    And i choose a "<heading>" , enter the "<email>" ,"<orderRef>","<message>",upload the "<file>"
    Then i should be able to submit the contact form

    Examples:
    | heading          | email               | orderRef            | message             | file                                                                     |
    | Customer service | email@hotmail.co.uk | 12345               | This is the message | C:\Users\Bruna.Dushku\Downloads\36f1270e-d64e-45aa-9e45-1bb3b09bb068.png |

    @CreateAccount
    Scenario Outline: validate the create account page

      And i enter my details
      Then is should be able to sign up and validate "<url>"

      Examples:

      | url                                                           |
      | http://automationpractice.com/index.php?controller=my-account |

    
