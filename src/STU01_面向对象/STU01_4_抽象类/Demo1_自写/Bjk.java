package STU01_面向对象.STU01_4_抽象类.Demo1_自写;

public class Bjk extends Card{
    public Bjk(String username, Double balance) {
        super(username, balance);
    }

    @Override
    public double pay(double money) {
        money = money*0.8;
        return money;
    }
}
