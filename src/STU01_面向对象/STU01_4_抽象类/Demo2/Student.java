package STU01_面向对象.STU01_4_抽象类.Demo2;

public abstract class Student {
    public void write(){
        System.out.println("=============我的梦想(作文头部)==========");
        writeMain();
        System.out.println("============完成时间2025-5-19（文末）===========");
    }
    public abstract void  writeMain();
}
