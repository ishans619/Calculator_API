package com.tool.calculatorAPI.controller;

import com.tool.calculatorAPI.service.OperandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
public class OperandController {

    @Autowired
    private OperandService operandService;

    @PostMapping("/add/{FirstOperand}/{SecondOperand}")
    public Long add(@PathVariable Long FirstOperand, @PathVariable Long SecondOperand){
        return operandService.add(FirstOperand, SecondOperand);
    }

    @PostMapping("/sub/{FirstOperand}/{SecondOperand}")
    public Long subtract(@PathVariable Long FirstOperand, @PathVariable Long SecondOperand){
        return operandService.subtract(FirstOperand, SecondOperand);
    }

    @PostMapping("/mul/{FirstOperand}/{SecondOperand}")
    public Long multiply(@PathVariable Long FirstOperand, @PathVariable Long SecondOperand){
        return operandService.multiply(FirstOperand, SecondOperand);
    }

    @PostMapping("/div/{FirstOperand}/{SecondOperand}")
    public Long divide(@PathVariable Long FirstOperand, @PathVariable Long SecondOperand){
        return operandService.divide(FirstOperand, SecondOperand);
    }
}
