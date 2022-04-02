package file;

import bg.tu_varna.sit.GetInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetInputFromMedia implements GetInput {

    File inputFile = new File("input.txt");
    Scanner scanner = new Scanner(inputFile);

    public GetInputFromMedia() throws FileNotFoundException {
    }


    @Override
    public double getFirstNumberInput() {
        return scanner.nextDouble();
    }

    @Override
    public double getSecondNumberInput() {
        return scanner.nextDouble();
    }

    @Override
    public char getOperationInput() {
        return scanner.next().charAt(0);
    }
}
