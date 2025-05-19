package STU01_面向对象.STU01_2_继承;

public class MainTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.sleep();
        teacher.teach();
        teacher.setName("哔哩哔哩");
        System.out.println(teacher.getName());
        teacher.showAge();
    }
}

