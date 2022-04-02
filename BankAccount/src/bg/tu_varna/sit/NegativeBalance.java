package bg.tu_varna.sit;

public class NegativeBalance extends Exception{
    public NegativeBalance() {
        super("You can not have negative balance");
    }
}
