#Autor: Pablo Andres Hernandez Morales
  @stories
  Feature: Automation of the registration in utest.com
    As user
    I want to create my profile in Utest
  @scenario1
  Scenario Outline: Create the user profile successful
    Given that the user is in the homepage of Utest go to create an account
    When he complete all the require data
    |name|last_name|email|birth_day|birth_month|birth_year|city|zip_code|password|
    |<name>|<last_name>|<email>|<birth_day>|<birth_month>|<birth_year>|<city>|<zip_code>|<password>|
    Then the account is create
      |text_successful|
      |<text_successful>|
    Examples:
      |name|last_name|email|birth_day|birth_month|birth_year|city|zip_code|password|text_successful|
      |Pablo|Hernandez|phernandezm@choucairtesting.com|17|05|1992|Medellin|050016|Qud#d<$n"K~5,7FZ|The last step|



