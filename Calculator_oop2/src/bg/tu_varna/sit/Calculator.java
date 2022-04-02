package bg.tu_varna.sit;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<Character, Operation> operations = new HashMap<>();

    public Calculator() {
        operations.put('+', new Add());
        operations.put('-', new Subtract());
        operations.put('*', new Multiply());
        operations.put('/', new Divide());
    }

    public double calculate(double firstNumber, char operation, double secondNumber) throws InvalidOperation {
        Operation calcOperation;
        if(operations.containsKey(operation)){
            calcOperation = operations.get(operation);
        }
        else {
            throw new InvalidOperation();
        }
        return calcOperation.calculateResult(firstNumber,secondNumber);
    }
}
