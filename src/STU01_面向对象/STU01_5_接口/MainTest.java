package STU01_面向对象.STU01_5_接口;

public class MainTest {
    public static void main(String[] args) {
        UsbFan usbFan = new UsbFan();
        usbFan.serviceForUsb2();
        usbFan.serviceForUsb3();
    }
}
