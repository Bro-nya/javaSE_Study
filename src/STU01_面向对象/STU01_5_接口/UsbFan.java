package STU01_面向对象.STU01_5_接口;

public class UsbFan implements Usb {
    //    public abstract void serviceForUsb2();/*可将此省略为如下*/
    @Override
    public void serviceForUsb2() {
        System.out.println(USB2.DEF);
    }

    @Override
    public void serviceForUsb3() {
        System.out.println(USB3.DEF);
    }

    @Override
    public void serviceForUsb4() {
        System.out.println(USB4.DEF);
    }
}
