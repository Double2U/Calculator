package calculator.app.calculator;

public abstract class Calculator<T>{

        public T getResult(){
                
         Calculatable<T> calculator = createCalculator();
         calculator.calculate();
         return calculator.sendResult();
        };


       abstract public Calculatable<T> createCalculator();

}
