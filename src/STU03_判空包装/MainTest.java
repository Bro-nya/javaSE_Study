package STU03_判空包装;

import java.util.Optional;

public class MainTest {
    public static void main(String[] args) {
        test("null");
    }

    public static void test(String str) {
        Optional
                .ofNullable(str)//传入对象包装进Optional中，ofNullable判断是否为空
                .ifPresent(s -> {//如果不为空执行
                    if(!s.isEmpty()) {//.isEmpty判断字符串是否为空
                        System.out.println(s.length());
                    }
                });

        String s = Optional.ofNullable(str).get();   //get方法可以获取被包装的对象引用，但是如果为空的话，会抛出异常
        System.out.println(s);

        String t = Optional.ofNullable(str).orElse("我是为null的情况备选方案");//.orElse,如果为空，返回备选方案
        System.out.println(t);

        Optional<Integer> u=Optional.ofNullable(str).map(w->w.length());//.map转换类型
        Integer u1=Optional.ofNullable(str).map(w->w.length()).get();//用get（）取出包装进Optional的Integer类
    }
}
