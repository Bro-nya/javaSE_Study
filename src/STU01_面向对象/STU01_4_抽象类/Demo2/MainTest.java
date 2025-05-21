package STU01_面向对象.STU01_4_抽象类.Demo2;

public class MainTest {
    public static void main(String[] args) {
        Student student1=new StudentChild();
        student1.write();
        Student student2=new StudentMid();
        student2.write();
    }
}
