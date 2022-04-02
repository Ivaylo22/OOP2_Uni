package file;

import bg.tu_varna.sit.GetOutput;

import java.io.FileWriter;
import java.io.IOException;

public class GetOutputFromMedia implements GetOutput {
    String outputFile = "output.txt";

    @Override
    public void gainOutput(double result) {
        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            String resultToString = Double.toString(result);
            fileWriter.write("result: " + resultToString);
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
