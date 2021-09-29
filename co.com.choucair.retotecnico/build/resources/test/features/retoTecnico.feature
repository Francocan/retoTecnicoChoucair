#Estiven Franco
  @stories
  Feature:carry out the completion of the form in order to create a new username.

    @scenario1
    Scenario Outline: the form will be filled out
      Given Steven will create a new user
        |firstname |lastname|email     |city  |postal  |password  |
        |<firstname>|<lastname>|<email>|<city>|<postal>|<password>|
      When Steven will into sign up
        |email  |password  |
        |<email>|<password>|
      Then Steven will verify account
      |email|
      |<email>|
      Examples:
        |firstname|lastname|email                   |city                         |postal|password       |
        |Estiven  |Franco  |libelula98@hotmail.com|Medellin, Antioquia, Colombia|050001|Lolalamejor7010+|


