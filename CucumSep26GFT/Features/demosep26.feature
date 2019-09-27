Feature: product purchase

  Background: 
    Given App is up
    
  @Register
  Scenario: User Registration
     Given user credentials are "john" and "piper"
     When provided the valid credentials
     Then Signup is success

  @FunctionalTest
  Scenario Outline: microwave purchase
    Given John purchase microwave for <price> rs
    And he has receipt
    When John returns the faulty microwave
    Then he got refund of <price> doll

    Examples: 
      | price |
      |   100 |
      |   200 |
      |   300 |
  @Regression
  Scenario: microwave purchase
    Given John purchase microwave for 200 rs
    And he has receipt
    When John returns the faulty microwave
    Then he got refund of 200 doll
  @FunctionalTest @Smoke
  Scenario: microwave purchase
    Given John purchase microwave for 300 rs
    And he has receipt
    When John returns the faulty microwave
    Then he got refund of 300 doll
 
   @Regression @Smoke
  Scenario: microwave purchase
    Given John purchase microwave for 200 rs
    And he has receipt
    When John returns the faulty microwave
    Then he got refund of 200 doll   
 
 
