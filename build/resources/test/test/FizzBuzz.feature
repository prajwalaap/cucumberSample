Feature: FizzBuzz game play

  Scenario: Play FizzBuzz to get Fizz
    Given Create a FizzBuzz game play
    When I play with number 3
    Then The reuslt is "Fizz"

  Scenario: Play FizzBuzz to get Buzz
    Given Create a FizzBuzz game play
    When I play with number 5
    Then The reuslt is "Buzz"

  Scenario: Play FizzBuzz to get FizzBuzz
    Given Create a FizzBuzz game play
    When I play with number 15
    Then The reuslt is "FizzBuzz"
