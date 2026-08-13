package com.example.calculator.controller;
import com.example.calculator.dto.CalculatorRequest;
import com.example.calculator.dto.CalculatorResponse;
import com.example.calculator.service.CalculatorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calc")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService)
    {
        this.calculatorService=calculatorService;
    }

    @PostMapping("/add")
    public CalculatorResponse add(@Valid @RequestBody CalculatorRequest request) {
        int result = calculatorService.add(request.getA(), request.getB());
        return new CalculatorResponse("add", request.getA(), request.getB(), result);
    }

    @PostMapping("/sub")
    public CalculatorResponse sub(@Valid @RequestBody CalculatorRequest request) {
        int result = calculatorService.sub(request.getA(), request.getB());
        return new CalculatorResponse("subtract",request.getA(), request.getB(),result);
    }

    @PostMapping("/mul")
    public CalculatorResponse mul(@Valid @RequestBody CalculatorRequest request) {
        int result = calculatorService.mul(request.getA(), request.getB());
        return new CalculatorResponse("multiply",request.getA(), request.getB(),result);
    }

    @PostMapping("/div")
    public CalculatorResponse div(@Valid @RequestBody CalculatorRequest request) {
        int result = calculatorService.div(request.getA(), request.getB());
        return new CalculatorResponse("divide",request.getA(), request.getB(),result);
    }

}