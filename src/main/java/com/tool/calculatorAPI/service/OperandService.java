package com.tool.calculatorAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperandService {

    public Long add(Long FirstOperand, Long SecondOperand){
        Long result = FirstOperand + SecondOperand;
        return result;
    }

    public Long subtract(Long FirstOperand, Long SecondOperand){
        Long result = Math.abs(FirstOperand - SecondOperand);
        return result;
    }

    public Long multiply(Long FirstOperand, Long SecondOperand){
        Long result = FirstOperand * SecondOperand;
        return result;
    }

    public Long divide(Long FirstOperand, Long SecondOperand){
        Long result = 0l;
        if(FirstOperand > SecondOperand){
            result = FirstOperand/SecondOperand;
        }
        else{
            result = SecondOperand/FirstOperand;
        }
        return result;
    }
}
