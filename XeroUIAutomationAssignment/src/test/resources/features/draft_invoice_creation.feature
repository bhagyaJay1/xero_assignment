@tag
Feature: Genarate Invoice
  I want to use this template for my feature file

  @tag1
  Scenario Outline:Genarate Invoice From Approved Quote
    Given as a user i should be able signed in to system using email "<username>" and password "<password>"
    And I can do two factor auth giving answers as "Dineth" and "QA engineer in xero" and "mazda"
    When I should be able to create new quote
    And Enter contact data as "Xero" and Item as "<Item>"
    And Verify display subtotal as "<subtotal>" and total GST as "<total GST>" and Total as "<Total>"
    And Send quote and verify subtotal as "<subtotal>" and total GST as "<total GST>" and Total as "<Total>"
    Then Accept the quote and create invoice
    And Verify data displayed in the invoice subtotal as "<subtotal>" and GST presentage as "<GSTPercentage>" and total GST as "<total GST>" and Total as "<Total>"
    And save the invoice as draft
    
    Examples:
    |username			|password	   |subtotal| total GST| Total|Item						|GSTPercentage|
    |bhagya727@gmail.com|bhagyaxero@727|15.00	| 2.25	   | 17.25|Golf balls - white 3-pack|15.00%		  |
    
   