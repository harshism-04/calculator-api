package com.example.calculator.controller;
import com.example.calculator.dto.CalculatorResponse;
import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.calculator.dto.CalculatorResponse;

@RestController
@RequestMapping("/api/calc")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService)
    {
        this.calculatorService=calculatorService;
    }

    @GetMapping("/add")
    public CalculatorResponse add(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.add(a,b);
        return new CalculatorResponse("add",a,b,result);
    }

    @GetMapping("/sub")
    public CalculatorResponse sub(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.sub(a,b);
        return new CalculatorResponse("subtract",a,b,result);
    }

    @GetMapping("/mul")
    public CalculatorResponse mul(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.mul(a,b);
        return new CalculatorResponse("multiply",a,b,result);
    }

    @GetMapping("/div")
    public CalculatorResponse div(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.div(a,b);
        return new CalculatorResponse("divide",a,b,result);
    }
    }