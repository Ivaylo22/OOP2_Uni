package bg.tu_varna.sit;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            User user1 = new User(10000);
            User user2= new User(3000);

            user1.enterTelephone();
            user1.chooseProvider();


            user1.account.payMoney(5000);
            user1.account.showBalance();
            user1.account.calculateChance();


            user2.enterTelephone();
            user2.chooseProvider();

            user2.account.payMoney(200);
            user2.account.showBalance();

        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
