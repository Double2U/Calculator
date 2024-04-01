package calculator.app.util;


public class ComplexNumber{

    private Double realPart;
    private Double imaginaryPart;

    public ComplexNumber(Double realPart, Double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber(){
        this.imaginaryPart = null;
        this.realPart = null;
    }

    public Double getRealPart() {
        return realPart;
    }


    public Double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        return realPart.toString() + " + " + imaginaryPart.toString() + "i";
    }
    
}
