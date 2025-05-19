package STU01_面向对象.STU01_4_抽象类.Demo1_自写;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要提交多少金额");
        Double inputMoney = Double.valueOf(sc.next());

        Bjk bjk=new Bjk("bronya",5000.0);
        double i=bjk.pay(inputMoney);
        System.out.println("白金卡优惠后："+i);

        Yk yk=new Yk("bronya",5000.0);
        double j=yk.pay(inputMoney);
        System.out.println("银卡优惠后："+j);
    }
}
