package calculator.app.operations;

public interface Operation<T>{

        T execute(T firstOperand, T secondOperand);
}
