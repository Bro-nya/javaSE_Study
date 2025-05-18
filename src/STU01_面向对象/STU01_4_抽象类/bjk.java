package STU01_面向对象.STU01_4_抽象类;

public class bjk extends Card{
    public bjk(String username, Double balance) {
        super(username, balance);
    }

    @Override
    public double pay(double money) {
        money = money*0.8;
        return money;
    }
}
