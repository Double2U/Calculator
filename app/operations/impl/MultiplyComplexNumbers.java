package calculator.app.operations.impl;

import calculator.app.operations.Operation;
import calculator.app.util.ComplexNumber;



public class MultiplyComplexNumbers implements Operation <ComplexNumber>{

    @Override
    public ComplexNumber execute(ComplexNumber firstOperand, ComplexNumber secondOperand) {

        Double resultReal = firstOperand.getRealPart()*secondOperand.getRealPart() - firstOperand.getImaginaryPart() * secondOperand.getImaginaryPart();
        Double resultImaginary = firstOperand.getImaginaryPart()*secondOperand.getRealPart() + firstOperand.getRealPart()*secondOperand.getImaginaryPart();
        ComplexNumber result = new ComplexNumber (resultReal, resultImaginary);
        return result; 
    }
    
}
