Feature: Registration using my page creation

  
  Scenario: Registration successful
    Given open the registration page
    And enter the below details
      | firstname | prem                   |
      | lastname  | kumar                  |
      | email     | Premkumar123@gmail.com |
      | telephone |             9832234242 |
      | password   | wwer@123               |
      | confirm   | wwer@123               |
    Then click on the radio button and checkbox
    Then click on continue button 
    
