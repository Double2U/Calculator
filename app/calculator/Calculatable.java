package calculator.app.calculator;

public interface Calculatable<T> {
    T sendResult();
    void calculate();
}
