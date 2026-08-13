package com.example.calculator.dto;
import jakarta.validation.constraints.NotNull;

public class CalculatorRequest {
    private Integer a;
    private Integer b;

    public CalculatorRequest()
    {}

    @NotNull(message="a is required")
    public Integer getA()
    {
        return a;
    }
    public void setA()
    {
        this.a=a;
    }
    
    @NotNull(message = "b is required")
    public Integer getB()
    {
        return b;
    }
    public void setB()
    {
        this.b=b;
    }
}
