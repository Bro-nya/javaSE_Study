package STU01_面向对象.STU01_6_多态;

public class Maintest {
    public static void main(String[] args) {
        Pet pet1=new Cat();
        pet1.eat();
        Pet pet2=new Dog();
        pet2.eat();
    }
}
