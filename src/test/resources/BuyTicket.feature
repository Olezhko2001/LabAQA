Feature: Buy Ticket

  Scenario Outline: Choose ticket from Weinfelden to Zurich and enter necessary information
    Given I am on SBB site
    When I enter "<from>" as from location
    Then From field should contain "<from>"
    When I enter  "<to>" as to location
    Then To field should contain "<to>"
    When I click Search connections
    Then Connections page is opened
      And I see "<from>" as origin location
      And I see "<to>" as destination location
    When I select the second connection
    Then I see Buy tickets button
    When I buy second ticket
    Then Login page is opened
    When I choose to buy as a guest
    Then Travel Data page is opened
    When I enter "<name>" as name
      And I enter "<surname>" as surname
      And I enter "<birthday>" as birthday
      And I choose No discount available
      And I select 1st class
    Then Name field contains "<name>"
      And Surname field contains "<surname>"
      And Birthday field contains "<birthday>"
      And I see No discount selected
      And I see 1st class selected
    When I click Submit button
    Then Payment page is opened
    When I enter "<email>"
    Then Email field contains "<email>"
    When I select credit card payment options
    Then I see credit card option selected
    When I agree to Terms and Conditions
    Then I see Terms and Conditions selected
    When I click purchase button
    Then I see credit card dialog

    Examples:
      | from  | to | name | surname | birthday | email |
      | Weinfelden | Zürich HB | Oleh | Kuzyk | 23.06.2001 | olezhko.kuzyk@gmail.com |

