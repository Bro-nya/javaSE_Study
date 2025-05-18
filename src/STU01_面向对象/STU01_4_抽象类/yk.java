package STU01_面向对象.STU01_4_抽象类;

public class yk extends Card{
    public yk(String username, Double balance) {
        super(username, balance);
    }

    @Override
    public double pay(double money) {
        money = money*0.9;
        return money;
    }
}
