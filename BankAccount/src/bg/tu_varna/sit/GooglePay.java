package bg.tu_varna.sit;

import com.sun.org.apache.xpath.internal.operations.Neg;

public class GooglePay extends Account implements IGetScratchCard{
    double moneyToPay;

    public GooglePay(double balance) {
        super(balance);
    }

    public GooglePay() {

    }

    public void showBalance(){
        ShowBalance myBalance = new ShowBalance(balance);
        myBalance.showBalance();
    }

    @Override
    public double payMoney(double amount) throws NegativeBalance{

        PayMoney myPayMoney = new PayMoney(balance,amount);
        balance = myPayMoney.payMoney(amount);
        moneyToPay = amount;
        if (balance < 0){
            throw new NegativeBalance();
        }
        return amount;
    }


    @Override
    public boolean calculateChance() {
        GetScratchCard myScratchCard = new GetScratchCard(moneyToPay);
        return myScratchCard.calculateChance();
    }

    @Override
    public double getCashBackAsCreditBalance() {
        int chance = 50;
        int percent = 10;
        GetCashBackAsCreditBalance myCashBack = new GetCashBackAsCreditBalance(balance,moneyToPay,chance,percent);
        balance = myCashBack.getCashBackAsCreditBalance();
        return balance;
    }
}
