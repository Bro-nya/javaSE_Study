package STU02_泛型.STU02_6_四大函数式接口.Demo2;

import java.util.function.Consumer;

/// consumer消费型函数式接口
public class MainTest {
    public static void main(String[] args) {
        Student student=new Student();
        STUDENT_CONSUMER
                .andThen(stu -> System.out.println("我是吃完之后的操作！"))
                .andThen(stu -> System.out.println("好了好了，吃饱了！"))
                .accept(student);
    }

    public static class Student {/*匿名内部类*/
        public void hello() {
            System.out.println("我是学生！");
        }
    }

    private static Consumer<Student> STUDENT_CONSUMER/*创建Consumer类型的常量*/ = new Consumer<Student>() {
        @Override
        public void accept(Student student) {
            System.out.println(student+"真好吃！");
        }
    };

    /// 这个lambda表达式替换前的样式为上面的：
    /*private static Consumer<Student> STUDENT_CONSUMER = student -> System.out.println(student+"真好吃！");*/

    ///private static Consumer<Student> STUDENT_CONSUMER = System.out::println; 个人验证：输入student，输出也student，相当于println（student）

}
