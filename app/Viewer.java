package calculator;

import java.util.Arrays;
import java.util.Scanner;

import calculator.app.calculator.*;
import calculator.app.util.*;

public class Viewer {


    public void run(){

        String descriprion = "Hello, User.\nTo make the application work, choose calculator is necessary for you from list calculators:" + Arrays.toString(TypeCalculator.values()) + "\n";
        System.out.print(descriprion);
        
        while (true){
            TypeCalculator tc;
            try{    
                tc = TypeCalculator.valueOf(prompt("Enter type calculator: ").toUpperCase());
            } catch (IllegalArgumentException e){
                return;
            }

            switch(tc){
                case COMPLEX: {
                    System.out.println("Enter first complex number");
                    Double realPart = Double.parseDouble(prompt("Real part: "));
                    Double imaginaryPart = Double.parseDouble(prompt("Imaginary part: "));
                    ComplexNumber firstComplexNumber = new ComplexNumber(realPart, imaginaryPart);
                    System.out.println("Enter second complex number");
                    realPart = Double.parseDouble(prompt("Real part: "));
                    imaginaryPart = Double.parseDouble(prompt("Imaginary part: "));
                    ComplexNumber secondComplexNumber = new ComplexNumber(realPart, imaginaryPart);

                    String operation = prompt("Enter operation +,-,*: ");

                    Calculator<ComplexNumber> calculator = new CalculatorComplexNumbers(firstComplexNumber, secondComplexNumber, operation);
                    System.out.println(calculator.getResult());
                    break;
                }

                case REAL: {
                    Double firstNumber = Double.parseDouble(prompt("Enter first real number:  "));
                    Double secondNumber = Double.parseDouble(prompt("Enter second real number:  "));
                    String operation = prompt("Enter operation +,-,*,/: ");

                    Calculator<Double> calculator = new CalculatorRealNumber(firstNumber, secondNumber, operation);
                    System.out.println(calculator.getResult());
                    break;
                }
            }
        }

    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
