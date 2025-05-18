package STU01_面向对象.STU01_3_重写与重载;

public class Teacher extends People {
    /// 方法重写
    @Override/*可以起到校验功能*/
    public void sleep() {
        super.sleep();
        System.out.println("起床");
    }

    /// 方法重载
    public void sleep(int hours) {
        super.sleep();
        System.out.println("睡"+hours+"小时叫我");
    }

    /// 验证1，2
    public Teacher() {
        super();/*会在第一行自动生成，不写也存在*/
        System.out.println("子类无参构造");
    }
}
