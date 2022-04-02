package bg.tu_varna.sit;

public class ShowBalance implements IShowBalance{
    double balance;

    public ShowBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}
