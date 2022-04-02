package bg.tu_varna.sit;

public interface IPayMoney {
    public double payMoney(double amount) throws NegativeBalance;
}
