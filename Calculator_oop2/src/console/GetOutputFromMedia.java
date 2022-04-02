package console;

import bg.tu_varna.sit.GetOutput;

public class GetOutputFromMedia implements GetOutput {

    @Override
    public void gainOutput(double result) {
        System.out.println("result : " + result);
    }
}
