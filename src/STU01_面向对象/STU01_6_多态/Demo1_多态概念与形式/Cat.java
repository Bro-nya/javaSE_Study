package STU01_面向对象.STU01_6_多态.Demo1_多态概念与形式;

public class Cat extends Pet{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void playball(){
        System.out.println("玩毛线球");
    }
}
