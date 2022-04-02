package bg.tu_varna.sit;

public class Divide implements Operation{
    @Override
    public double calculateResult(double firstNumber, double secondNumber) {
        if(secondNumber == 0) {
            throw new ArithmeticException("You are dividing by 0");
        }
        return firstNumber/secondNumber;
    }
}
