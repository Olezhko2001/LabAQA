Feature: Buy Ticket

  Scenario Outline: Choose ticket from Weinfelden to Zurich and enter necessary information
    Given I am on SBB site
    Then I decline all cookies
    When I enter "<from>" as from location
    Then From field should contain "<from>"
    When I enter "<to>" as to location
    Then To field should contain "<to>"
    When I select the second connection
    Then I see Buy tickets button
    When I buy second ticket
    Then Login page is opened
    When I choose to continue as a guest
    Then Login as guest button appears
    When I choose to login as a guest
    Then Travel Data page is opened
    When I enter "<email>" as email
      And I enter "<name>" as name
      And I enter "<surname>" as surname
      And I choose No discount available
      And I enter "<birthday>" as birthday
    Then Email field contains "<email>"
      And Name field contains "<name>"
      And Surname field contains "<surname>"
      And I see No discount selected
      And Birthday field contains "<birthday>"
      And I click Submit button

    Examples:
      | from  | to | name | surname | birthday | email |
      | Weinfelden | Zürich HB | Carl | Peterson | 22.02.1992 | carl.peterson@gmail.com |

