package STU01_面向对象.STU01_6_多态.Demo1_多态概念与形式;

public class Maintest {
    public static void main(String[] args) {
        Pet pet1=new Cat();
        pet1.eat();
        Pet pet2=new Dog();
        pet2.eat();
        /// 上面的的也属于叫向上转型：但不能访问子类变量和独有方法，比如不能访问狗的playdisk()但能访问Dog已经重写了的eat（）；
        /// 下面为向下转型：解决了不能访问子类对象的属性和独有方法的问题，但如果转换与实际不一样，那运行时就会报错，出现ClassCastException：
        /// 影刺建议向下转型前进行判断：if（pet2 instanceof Dog）{Dog dog=(Dog)pet2;}
        Dog dog=(Dog)pet2;
    }
}
