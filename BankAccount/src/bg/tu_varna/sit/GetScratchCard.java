package bg.tu_varna.sit;

import java.util.Random;

public class GetScratchCard extends ScratchCard implements IGetScratchCard{
    public GetScratchCard(double moneyToPay) {
        super(moneyToPay);
    }

    @Override
    public boolean calculateChance() {
        if (moneyToPay > 100 && moneyToPay <1000){
            chance = 10;
        }
        else if (moneyToPay >= 1000 && moneyToPay < 3000){
            chance = 20;
        }
        else if (moneyToPay >= 3000 && moneyToPay < 5000){
            chance = 50;
        }
        else if (moneyToPay >= 5000 && moneyToPay < 10000){
            chance = 50;
        }
        else if (moneyToPay >= 10000){
            chance = 100;
        }
        System.out.println("You have " + chance + "% chance to win a scratch card !");

        Random r = new Random();
        boolean isWinning = false;
        int choice = r.nextInt(100 ) + 1;
        if (chance > choice){
            System.out.println("You won scratch card !");
            isWinning = true;
        }
        else {
            System.out.println("Better luck next time!");
        }
        return isWinning;

    }
}
