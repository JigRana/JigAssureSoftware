Feature: Land Confirmation Record add and save functionalty

@regression
  Scenario: Land confirmation record add
    Given User is on Login Page
    When User enter username "JigarR" and password "SHE129"
    And User click on Login button and navigate to home page
    And User click on Land Contamination using modules drop down menu
    And User nevigate to Land Confirmation Page
    And User click on New Record button
    And User fill in sample date and Description fields
    And User click on save and close button
    And User click on New Record Button to add another record
    And User fill new date and Description
    And User click on save and close button
    And User click cog link and delete the first record that was created by test
    Then User can see record succesfully deleted.
    And User logged out from the website


