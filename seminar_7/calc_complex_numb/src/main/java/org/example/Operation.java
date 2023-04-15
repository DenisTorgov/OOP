package org.example;

public class Operation extends ComlexOperation{
    String result;
    public String Sum(double firstarg, double secondarg) {
        return result = String.valueOf(firstarg + secondarg);
    }
    public String Mult (double firstarg, double secondarg) {
        return result = String.valueOf(firstarg * secondarg);
    }
    public String Div(double firstarg, double secondarg) {
        return result = String.valueOf(firstarg / secondarg);
    }
    @Override
    public String getResult() {
        return result;
    }
}