Feature: Check if a String is a Palindrome 

  Scenario: Given input should be a palindrome
  
    When I invoke palindrome service with "aba" as input
    Then I should get true
