#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Creating the employee
    Given the name, id, and address
    And is given properly 
    When the createEmployee method is invoked
    Then the save method is invoked and the details are saved in hash map
    And successfully and employee is created successfully.

  @tag2
  Scenario Outline: The name of employee is passed null while creating the employee
    Given Name of the employee is null
    When the create Method is invoked 
    Then the system should throw an exception.
    
   @tag3
   Scenario: Duplicate id is entered
   Given The id is entered 
   When The id entered at the time of creation is 
   And already existed in the hash map
   Then the Employee must not be created and the system should throw an exception
   
   @tag4
   Scenario: Address of the employee is null
   Given Address provided is null
   When the create method is invoked 
   Then the system should throw an exception showing address is null. 
   
   @tag5
   Scenario: If the id is null
   Given the id entered is null
   When the id provided is null
   Then the systyem should throw an exception.
   
   @tag6
   Scenario: What if the name you are searching for does not exist
   Given the name is provided for sewarching the employee in hash table
   When the name is being searched in the hash table and it is not found 
   Then The system should throw an exception showing the name is not present.
   
   @tag7
   Scenario: name is null while searching
   Given The name column is null or empty
   When the search method is invoked and the name is null or empty
   Then The system should throw and exception name is null.
   
   @tag8 
   Scenario: The Search is completed successfully
   Given the id, name and address is provided valid
   When The search method is invoked it invokes the findByName method is called 
   Then the list of employees having same names are returned in a list successfully. 

  