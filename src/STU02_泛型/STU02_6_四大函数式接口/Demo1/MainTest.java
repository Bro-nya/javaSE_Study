package STU02_泛型.STU02_6_四大函数式接口.Demo1;

import java.util.function.Supplier;

/// supplier供给型函数接口
public class MainTest {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier=new Supplier<Student>() {
            @Override
            public Student get() {
                return new Student();
            }
        };
        /*上文替换为lambda表达式为 Supplier<Student> studentSupplier= () -> new Student();*/
        /*将lambda替换为方法引用Supplier<Student> studentSupplier= Student::new;*/


        studentSupplier.get().hello();
    }

    public static class Student {/*匿名内部类*/
        public void hello(){
            System.out.println("我是学生！");
        }
    }
}
