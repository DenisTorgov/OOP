package org.example;

public class ComlexOperation implements OperationsList{
    String result;

    @Override
    public String Sum(double firstarg, double secondarg) {
        Operation res = new Operation();
        return res.Sum(firstarg, secondarg);
    }
    @Override
    public String Mult(double firstarg, double secondarg) {
        Operation res = new Operation();
        return res.Mult(firstarg, secondarg);
    }
    @Override
    public String Div(double firstarg, double secondarg) {
        Operation res = new Operation();
        return res.Div(firstarg, secondarg);
    }
    @Override
    public String ComplSum(String sum1, String sum2) {
        if (Double.valueOf(sum2) > 0) {
            result = sum1 +" +" + sum2 + "i";
        }
        else {
            result = sum1 +" " + sum2 + "i";
        }
        return result;
    }
    @Override
    public String getResult() {
        return result;
    }

    @Override
    public String ComplMult(double a, double b, double c, double d) {
        if (b*c + a*d > 0) {
            result = (a*c - b*d) +" +" + (b*c + a*d) + "i";
        }
        else {
            result = (a*c - b*d) +" " + (b*c + a*d) + "i";
        }
        return result;
    }
    @Override
    public  String ComplDiv (double a, double b, double c, double d) {
        if ((b*c - a*d)/(c*c +d*d) > 0) {
            result = (a * c + b * d) / (c * c + d * d) + " +" + (b * c - a * d) / (c * c + d * d) + "í";
        }
        else {
            result = (a * c + b * d) / (c * c + d * d) + " " + (b * c - a * d) / (c * c + d * d) + "í";
        }
        return result;
    }
}
