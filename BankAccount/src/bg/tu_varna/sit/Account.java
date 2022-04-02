package bg.tu_varna.sit;

public abstract class Account implements IPayMoney,IGetCashBackAsCreditBalance, IShowBalance, IGetScratchCard{
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    public Account(){};

    @Override
    public double payMoney(double amount) throws NegativeBalance {
        return 0;
    }

    @Override
    public boolean calculateChance() {
        return true;
    }

    @Override
    public double getCashBackAsCreditBalance() {
        return 0;
    }

    @Override
    public void showBalance() {
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
