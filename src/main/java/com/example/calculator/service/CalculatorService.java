package com.example.calculator.service;
import com.example.calculator.exception.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a,int b)
    {
        return a+b;
    }

    public int sub(int a,int b)
    {
        return a-b;
    }

    public int mul(int a,int b)
    {
        return a*b;
    }

    public int div(int a,int b)
    {
        if(b==0)
        {
            throw new DivisionByZeroException("Cannot Divide By Zero");
        }
        else
        {
            return a / b;
        }
    }
}
