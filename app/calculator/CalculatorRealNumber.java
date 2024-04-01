package calculator.app.calculator;

import java.util.HashMap;
import java.util.Map;

import calculator.app.operations.ManageOperation;
import calculator.app.operations.Operation;


public class CalculatorRealNumber extends Calculator<Double> implements Calculatable<Double> {

    private Double firstNumber;
    private Double secondNumber;
    private Double result;
    private String operation;
    private ManageOperation<Double> manageOperation = new ManageOperation<>();
    private static Map<String, Operation<Double>> map = new HashMap<>();

    static{
        map.put("+", (a, b) -> a + b );
        map.put("-", (a, b) -> a - b );
        map.put("*", (a, b) -> a * b );
        map.put("/", (a, b) -> a / b );
    }


    public CalculatorRealNumber(Double fNumber, Double sNumber, String op){
        this.firstNumber = fNumber;
        this.secondNumber = sNumber;
        this.operation = op;
        this.result = null;
    }

    @Override
    public Double sendResult() {
        return this.result;
    }

    @Override
    public void calculate() {
        manageOperation.setOperation(map.get(operation));
        this.result = manageOperation.executeOperation(firstNumber, secondNumber);
    }

    @Override
    public Calculatable<Double> createCalculator() {
        return new CalculatorRealNumber(firstNumber,secondNumber, operation);
    }
    
}
