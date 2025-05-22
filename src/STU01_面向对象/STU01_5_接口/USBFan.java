package STU01_面向对象.STU01_5_接口;

public class USBFan implements Usb {
    @Override
    public void serviceForUsb2() {
        System.out.println("规范协议："+USB2.DEF);
    }

    @Override
    public void serviceForUsb3() {
        System.out.println("规范协议："+USB3.DEF);
    }

    @Override
    public void serviceForUsb4() {
        System.out.println("规范协议："+USB4.DEF);
    }
}
