package com.cucumber.example;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

public class testNGSample extends AbstractTestNGCucumberTests {

    @Test
    public void feature (){
        System.out.println("FEature test");
    }
}
