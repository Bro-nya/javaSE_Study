package STU01_面向对象.STU01_6_多态.Demo2_多态的应用;

public class Dog extends Pet {
    @Override
    public void eat() {
        System.out.println("狗吃鱼骨头");
    }
    public void playdisk(){
        System.out.println("玩飞盘");
    }
}
