package model;

public class BasicCalculator {
    private double op1, op2, lastResult;

    public double getAdd(String value1, String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        lastResult = op1 + op2;
        return lastResult;
    }
    public double getSub(String value1, String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        lastResult = op1 - op2;
        return lastResult;
    }
    public double getMulti(String value1, String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        lastResult = op1 * op2;
        return lastResult;
    }
    public double getDiv(String value1, String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        lastResult = op1 / op2;
        return lastResult;
    }
}
