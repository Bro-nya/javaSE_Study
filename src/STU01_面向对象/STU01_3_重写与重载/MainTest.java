package STU01_面向对象.STU01_3_重写与重载;

public class MainTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.sleep();/*调用重写*/
        teacher.sleep(20);/*调用重载*/
    }
}
