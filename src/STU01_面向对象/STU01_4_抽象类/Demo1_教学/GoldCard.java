package STU01_面向对象.STU01_4_抽象类.Demo1_教学;

public class GoldCard extends Card {
    public GoldCard() {
    }

    public GoldCard(String username, Double balance) {
        super(username, balance);
    }

    @Override
    public void pay(Double money) {
        System.out.println("============已进入支付系统===============");
        System.out.println("您的卡上余额："+getBalance()+"元");
        System.out.println("您当前消费："+money+"元");
        System.out.println("当前为金卡，可享受8折优惠");
        double realMoney = money*0.8;
        setBalance(getBalance()-realMoney);
        System.out.println(getUsername()+":优惠后，本次实际消费:"+realMoney+"，消费后，余额为："+getBalance());
    }
}
