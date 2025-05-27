package STU02_泛型.STU02_3_泛型方法;

public class MainTest {
    public static void main(String[] args) {
        String str=test("xxx");/*加了static变成静态类，属于类，可直接通过类名调用，无需创建对象*/
        Integer str2=test(1);

        MainTest mainTest=new MainTest();

        String str3=mainTest.test("XXX");
        String str4=mainTest.Test3("lll");
    }

    public static <T> T test(T t){/*泛型方法*/
        return t;
    }
    public  <T> T Test2 (T t){
        return t;
    };
    public <T> String Test3 (T t){
        return (String) t;
    }
}
