package STU01_Object_Oriented.STU01_1_encapsulation.Demo01;

public class Main {
    public static void main(String[] args) {
        People people = new People();

//        people.eat();

        /// get,set使用
//        people.setAge(30);
//        System.out.println(people.getAge());
        /// ——————————————————————————————————————
        Circle circle = new Circle();
        circle.setRadius(60);
        people.drawCircle(circle);
    }
}
