package calculator.app.operations;

public class ManageOperation<T> {

    private Operation<T> operation;

    public Operation<T> setOperation(Operation<T> operation){

        return this.operation = operation;

    }

    public T executeOperation(T firstOperand, T secondOperand){
        return operation.execute(firstOperand, secondOperand);
    }
    
}
