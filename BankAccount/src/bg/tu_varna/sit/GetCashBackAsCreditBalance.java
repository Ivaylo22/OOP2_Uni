package bg.tu_varna.sit;

import java.util.Random;

public class GetCashBackAsCreditBalance implements IGetCashBackAsCreditBalance{
    double balance;
    double moneyToPay;
    int chanceToTake;
    double percent;

    public GetCashBackAsCreditBalance(double balance, double moneyToPay, int chanceToTake, double percent) {
        this.balance = balance;
        this.moneyToPay = moneyToPay;
        this.chanceToTake = chanceToTake;
        this.percent = percent;
    }

    @Override
    public double getCashBackAsCreditBalance() {
        boolean isLucky;
        Random r = new Random();
        int choice = r.nextInt(100 - 1 + 1) + 1;


        if(chanceToTake<=choice){
            isLucky = false;
        }
        else{
            isLucky = true;
        }

        if (isLucky){
            System.out.println("You are lucky");
            balance += moneyToPay*percent/100;
            System.out.println("New balance: " + balance);
        }
        else {
            System.out.println("Better luck next time");
        }
        return balance;
    }
}
