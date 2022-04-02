package bg.tu_varna.sit;

public class Paytm extends Account{
    double moneyToPay;
    public Paytm(double balance) {
        super(balance);
    }

    public Paytm() {

    }

    public void showBalance(){
        ShowBalance myBalance = new ShowBalance(balance);
        myBalance.showBalance();
    }

    @Override
    public double payMoney(double amount)  throws NegativeBalance {
        PayMoney myPayMoney = new PayMoney(balance,amount);
        balance = myPayMoney.payMoney(amount);
        moneyToPay = amount;
        if (balance < 0){
            throw new NegativeBalance();
        }
        return amount;
    }

    @Override
    public double getCashBackAsCreditBalance() {
        int chance = 70;
        int percent = 5;
        GetCashBackAsCreditBalance myCashBack = new GetCashBackAsCreditBalance(balance,moneyToPay,chance,percent);
        balance = myCashBack.getCashBackAsCreditBalance();
        return balance;
    }
}
