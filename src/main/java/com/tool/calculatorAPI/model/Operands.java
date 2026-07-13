package com.tool.calculatorAPI.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

public class Operands {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long FirstOperand;

    private Long SecondOperand;

    public Operands() {
    }

    public Operands(Long id, Long firstOperand, Long secondOperand) {
        this.id = id;
        FirstOperand = firstOperand;
        SecondOperand = secondOperand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFirstOperand() {
        return FirstOperand;
    }

    public void setFirstOperand(Long firstOperand) {
        FirstOperand = firstOperand;
    }

    public Long getSecondOperand() {
        return SecondOperand;
    }

    public void setSecondOperand(Long secondOperand) {
        SecondOperand = secondOperand;
    }
}
