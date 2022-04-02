package console;

import bg.tu_varna.sit.GetInput;
import java.util.Scanner;

public class GetInputFromMedia implements GetInput {
    Scanner scanner = new Scanner(System.in);
    @Override
    public double getFirstNumberInput() {
        System.out.println("First number:");
        return scanner.nextDouble();
    }

    @Override
    public double getSecondNumberInput() {
        System.out.println("Second number:");
        return scanner.nextDouble();
    }

    @Override
    public char getOperationInput() {
        System.out.println("Operation (+ - * / ):");
        return scanner.next().charAt(0);
    }
}
