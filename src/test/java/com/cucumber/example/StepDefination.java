package com.cucumber.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class StepDefination {

    FizzBuzz fizzBuzz;
    private String result;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() {
        System.out.println("\nINSIDE GAME\n");
        fizzBuzz= new FizzBuzz();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int arg0) {
        result = fizzBuzz.play(arg0);
    }

    @Then("^The reuslt is \"([^\"]*)\"$")
    public void theReusltIs(String arg0)  {
        System.out.println("RESULT:"+result);
        Assert.assertEquals(result,arg0);
    }
}
