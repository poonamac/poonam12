Feature: Google Homepage title
Scenario: Title of google homepage is Google
    Given user launches the browser
    When user navigates to google homepage
    Then title is Google.