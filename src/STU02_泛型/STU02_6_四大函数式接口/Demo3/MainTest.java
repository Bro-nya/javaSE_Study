package STU02_泛型.STU02_6_四大函数式接口.Demo3;

import java.util.function.Function;
/// Function 接收一个又传出一个（前面两个结合体）
public class MainTest {
    public static final Function<Integer, String> INTEGER_STRING_FUNCTIONfun = Object::toString;//处理顺序：2
    public static void main(String[] args) {
        Boolean str=INTEGER_STRING_FUNCTIONfun
                .compose((String s) -> s.length())//处理顺序：1
                .andThen((s ->s.isEmpty() ))//处理顺序：3
                .apply("xxxxx");//处理顺序：2（方法是上面的那个）
        System.out.println(str);
        Function<String, String> function=Function.identity();//返回原样的实现
        System.out.println(function.apply("LLLLL"));
    }
}
