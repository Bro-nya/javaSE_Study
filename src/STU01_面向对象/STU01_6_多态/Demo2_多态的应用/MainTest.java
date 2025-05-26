package STU01_面向对象.STU01_6_多态.Demo2_多态的应用;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class MainTest {
    public static void main(String[] args) {
        /// 抽象父类或接口作为方法的参数
        Master master=new Master();
        master.feed(new Dog());
        Master master2=new Master();
        master.feed(new Cat());

        /// 抽象父类或者方法作为方法的返回类型
        Pet pet = master.getPet(1);
        master.feed(pet);
        master.play(pet);
    }
}
