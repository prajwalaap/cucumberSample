package com.cucumber.example;

import java.util.function.BiFunction;

public class FizzBuzz {
    public String play(Integer number){
        if(isMultiply.apply(number,3)&&isMultiply.apply(number,5)) return "FizzBuzz";
        if(isMultiply.apply(number,3)) return "Fizz";
        if(isMultiply.apply(number,5)) return "Buzz";
        return "null";
    }

    BiFunction<Integer,Integer,Boolean> isMultiply = (number,i) -> number%i==0;

}
