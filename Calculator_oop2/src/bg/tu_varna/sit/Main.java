package bg.tu_varna.sit;
import console.GetInputFromMedia;
import console.GetOutputFromMedia;

public class Main {

    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            double firstNumber, secondNumber;
            char operation;
            double result;

            GetInput input = new GetInputFromMedia();
            firstNumber = input.getFirstNumberInput();
            operation = input.getOperationInput();
            secondNumber = input.getSecondNumberInput();

            result = calculator.calculate(firstNumber,operation,secondNumber);

            GetOutput myOutput = new GetOutputFromMedia();
            myOutput.gainOutput(result);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
