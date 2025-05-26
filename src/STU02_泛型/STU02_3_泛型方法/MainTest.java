package STU02_泛型.STU02_3_泛型方法;

public class MainTest {
    public static void main(String[] args) {
        String str=test("xxx");
        Integer str2=test(1);

        MainTest mainTest=new MainTest();
        String str3=mainTest.test("XXX");
    }
    public static<T> T test(T t){/*泛型方法*/
        return t;
    }
    public  <T> T Test2 (T t){
        return t;
    };
}
