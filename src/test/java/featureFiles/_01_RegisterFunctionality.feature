Feature: Register Functionality

  Background:
    Given Navigate to web site
    When Click on My Account drop menu and click on Register

  Scenario: Validate Registering an Account by providing only the Mandatory fields - TC_RF_001
    And Fill the mandatory fields, first name, last name, email, telephone, password, confirm password, privacy policy
      | Techno            |
      | Study             |
      | batch07@gmail.com |
      | 123456789         |
      | batch07           |
      | batch07           |
    And Click on continue button
    And Account Success page is displayed
    And Click on continue button of account success page
    Then Account page is displayed

  Scenario: Validate Registering an Account by providing all the fields - TC_RF_003
    And Fill the mandatory fields, first name, last name, email, telephone, password, confirm password, privacy policy
      | Techno1            |
      | Study1             |
      | batch071@gmail.com |
      | 1234567891         |
      | batch071           |
      | batch071           |
    And Select newsletter subscription default No
    And Click on continue button
    And Account Success page is displayed
    And Click on continue button of account success page
    Then Account page is displayed

  Scenario: Validate proper notification messages are displayed for the mandatory fields, when you don't provide any fields in the 'Register Account' page and submit - TC_RF_004
    And Click on continue button
    Then Warning messages should be displayed for first name, last name, email, telephone, password, privacy policy

  Scenario: Validate Registering the Account without selecting the 'Privacy Policy' checkbox option -TC_RF_021
    And Fill the fields, first name, last name, email, telephone, password, confirm password

      | Techno4            |
      | Study4             |
      | batch074@gmail.com |
      | 1234567894         |
      | batch074           |
      | batch074           |

    And Select newsletter subscription default No
    And Click on continue button
    Then Warning messages should be displayed for privacy policy

  Scenario: Validate navigating to other pages using the options or links provided on the 'Register Account' page - TC_RF_023/1
    And Click on login page link

  Scenario: Validate navigating to other pages using the options or links provided on the 'Register Account' page - TC_RF_023/2
    And Click on right column links

  Scenario: Validate navigating to other pages using the options or links provided on the 'Register Account' page - TC_RF_023/3
    And Click on footer links

  Scenario: Validate navigating to other pages using the options or links provided on the 'Register Account' page - TC_RF_023/4
    And Click on menu options

  Scenario: Validate navigating to other pages using the options or links provided on the 'Register Account' page - TC_RF_023/5
    And Click on top links

  Scenario: Validate Registering an Account when 'Yes' option is selected for Newsletter field - TC_RF_005
    And Fill the mandatory fields, first name, last name, email, telephone, password, confirm password, privacy policy
      | Techno7            |
      | Study7             |
      | batch077@gmail.com |
      | 1234567897         |
      | batch077           |
      | batch077           |

    And Select newsletter subscription default Yes
    And Click on continue button
    And Account Success page is displayed
    And Click on continue button of account success page
    Then Account page is displayed
    Then Yes option is displayed in Newsletter page

  Scenario: Validate Registering an Account when 'Yes' option is selected for Newsletter field - TC_RF_006
    And Fill the mandatory fields, first name, last name, email, telephone, password, confirm password, privacy policy
      | Techno10           |
      | Study10            |
      | batch010@gmail.com |
      | 1234567810         |
      | batch010           |
      | batch010           |

    And Select newsletter subscription default No
    And Click on continue button
    And Account Success page is displayed
    And Click on continue button of account success page
    Then Account page is displayed
    Then No option is displayed in Newsletter page

  Scenario:Validate whether the Password fields in the Register Account page are following Password Complexity Standards - TC_RF_017
    And Fill the mandatory fields, first name, last name, email, telephone, password, confirm password, privacy policy
      | Techno11           |
      | Study11            |
      | batch011@gmail.com |
      | 1234567811         |
      | 12345              |
      | 12345              |
    And Click on continue button
    Then Warning message should be displayed for Password Complexity Standards

  Scenario: Validate different ways of navigating to 'Register Account' page - TC_RF_007
    And Click on My Account drop menu
    And Click on login option
    And Click on continue button inside New Customer box
    And Click on My Account drop menu
    And Click on login option
    And Click on Register option from Right Column options

  Scenario: Validate Registering an Account by entering different passwords into 'Password' and 'Password Confirm' fields - TC_RF_008
    And Fill the mandatory fields, first name, last name, email, telephone, password, confirm password, privacy policy
      | Techno12           |
      | Study12            |
      | batch012@gmail.com |
      | 1234567812         |
      | 12345              |
      | abcde              |
    And Click on continue button
    Then Warning message should be displayed under Password Confirm field

  Scenario: Validate Registering an Account by providing the existing account details (i.e. existing email address) - TC_RF_009
    And Fill the mandatory fields, first name, last name, email, telephone, password, confirm password, privacy policy
      | Pavan                     |
      | B                         |
      | pavanoltraining@gmail.com |
      | 8142400000                |
      | 12345                     |
      | 12345                     |
    And Click on continue button
    Then Warning message should be displayed for Email Address

  Scenario:Validate whether the 'Privacy Policy' checkbox option is not selected by default - TC_RF_020
    And View the privacy policy check box is not selected

  Scenario: Validate Registering an Account, by filling 'Password' field and not filling 'Password Confirm' field - TC_RF_024
    And Fill the fields, first name, last name, email, telephone, password, privacy policy
      | Techno13           |
      | Study13            |
      | batch013@gmail.com |
      | 1234567813         |
      | 12345              |

    And Click on continue button
    Then Warning message should be displayed under Password Confirm field

    Scenario: Validate the Breadcrumb, Page Heading, Page URL, Page Title of 'Register Account' Page - TC_RF_025
      Then Proper Breadcrumb, Page Heading, Page URL and Page Title should be displayed
















