package bg.tu_varna.sit;

public class PayMoney implements IPayMoney{
    double balance;
    double moneyToPay;

    public PayMoney(double balance, double moneyToPay) {
        this.balance = balance;
        this.moneyToPay = moneyToPay;
    }

    @Override
    public double payMoney(double amount) {
        balance -= amount;
        System.out.println(balance);
        return balance;
    }
}
