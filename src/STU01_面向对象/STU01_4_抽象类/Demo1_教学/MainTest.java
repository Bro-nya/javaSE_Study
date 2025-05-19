package STU01_面向对象.STU01_4_抽象类.Demo1_教学;

public class MainTest {
    public static void main(String[] args) {
        Card card=new GoldCard("布洛妮娅",10000.0);
        card.pay(1000.0);
        Card card1=new SilverCard("bbb",1000.0);
        card1.pay(100.0);
    }
}
