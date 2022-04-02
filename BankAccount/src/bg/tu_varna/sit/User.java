package bg.tu_varna.sit;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class User{
    double balance;
    Account account;
    String telephoneNumber;

    public User(double balance){
        this.balance=balance;
    };
    public User(String telephoneNumber, Account account) {
        this.account = account;
        this.telephoneNumber = telephoneNumber;
    }
    Scanner scanner = new Scanner(System.in);

    public void chooseProvider(){

        while(true){
            System.out.println("Enter provider:");
            String provider = scanner.nextLine();

            if (provider.equals("GooglePay")){
                this.setAccount(new GooglePay(balance));
                System.out.println("GooglePay is successfully chosen !");
                break;
            }
            else if(provider.equals("Paytm")){
                this.setAccount(new Paytm(balance));
                System.out.println("Paytm is successfully chosen !");
                break;
            }
            else{
                System.out.println("There is no such provider");
            }
        }
    }

    public void enterTelephone(){
        System.out.println("Enter telephone number:");
        String telephone = scanner.nextLine();
        this.setTelephoneNumber(telephone);
        System.out.println("User's telephone is " + telephone);
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return telephoneNumber.equals(user.telephoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telephoneNumber);
    }
}
