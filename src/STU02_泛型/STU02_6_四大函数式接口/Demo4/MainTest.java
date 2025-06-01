package STU02_泛型.STU02_6_四大函数式接口.Demo4;

import java.util.function.Predicate;

/// Predicate断言型函数式接口：接接收一个参数，然后进行自定义判断后返回一个boolean结果
public class MainTest {
    private static final Predicate<Student> STUDENT_PREDICATE=student -> student.score>=60;
    public static void main(String[] args) {
        Student student = new Student();
        student.score=80;
        if(STUDENT_PREDICATE
                .and(stu->stu.score>90)//与运算，还要满足这个条件才返回真（里面还有或，等）
                .test(student)){
            System.out.println("及格了，奖励自己");
        } else {
            System.out.println("没及格。也奖励自己");
        }
    }
    public static class Student {
        int score=100;
        public void study() {
            System.out.println("我是学生" );
        }
    }
}
