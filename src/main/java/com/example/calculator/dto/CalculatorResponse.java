package com.example.calculator.dto;

public class CalculatorResponse {

    private String operation;
    private int a;
    private int b;
    private int result;

    public CalculatorResponse(String operation,int a,int b,int result)
    {
        this.operation=operation;
        this.a=a;
        this.b=b;
        this.result=result;
    }

    public String getOperation()
    {
        return operation;
    }

    public int getA()
    {
        return a;
    }

    public int getB()
    {
        return b;
    }

    public int getResult()
    {
        return result;
    }
}
