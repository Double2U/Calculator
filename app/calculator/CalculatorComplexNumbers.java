package calculator.app.calculator;

import java.util.HashMap;
import java.util.Map;

import calculator.app.operations.impl.*;
import calculator.app.operations.*;

import calculator.app.util.ComplexNumber;


public class CalculatorComplexNumbers extends Calculator<ComplexNumber> implements Calculatable<ComplexNumber> {
    
    private ComplexNumber firstComplexNumber;
    private ComplexNumber secondComplexNumber;
    private String operation;
    private ComplexNumber result;
    private static Map<String, Operation<ComplexNumber>> map = new HashMap<>();
    
    static{
        map.put("+", new AddComplexNumber());
        map.put("-", new SubstractComplexNumbers());
        map.put("*", new MultiplyComplexNumbers());
    }

    private ManageOperation<ComplexNumber> manageOperation = new ManageOperation<>();

    public CalculatorComplexNumbers(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber, String op){
        this.firstComplexNumber = firstComplexNumber;
        this.secondComplexNumber = secondComplexNumber;
        this.operation = op;
        this.result = null;
    }


    @Override
    public void calculate() {
        manageOperation.setOperation(map.get(operation));
        this.result = manageOperation.executeOperation(firstComplexNumber, secondComplexNumber);

    }

    @Override
    public ComplexNumber sendResult() {
        return this.result;
    }


    @Override
    public Calculatable<ComplexNumber> createCalculator() {
        return new CalculatorComplexNumbers(firstComplexNumber, secondComplexNumber, operation);
    }

    
}
