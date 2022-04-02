package bg.tu_varna.sit;

public class Multiply implements Operation{
    @Override
    public double calculateResult(double firstNumber, double secondNumber) {
        return firstNumber*secondNumber;
    }
}
