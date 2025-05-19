package STU01_面向对象.STU01_1_封装.Demo01;

public class MainTest {
    public static void main(String[] args) {
        People people = new People();

//        people.eat();

        /// get,set使用
//        people.setAge(30);
//        System.out.println(people.getAge());
        /// ——————————————————————————————————————
        Circle circle = new Circle();
        try {
            circle.setRadius(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        people.drawCircle(circle);
    }
}
