package STU05_集合类.STU10_Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("aaaa", "Bbbb", "cccc","xx","Asllj","aaaa"));
        //删除长度不大于三
        //删除首字母不是大写
        //去掉重复字符串
        list=list.stream()
                .filter(str -> str.length() >3)//满足要求的不过滤
                .filter(str -> str.charAt(0)>='A' && str.charAt(0)<'Z')
                .distinct()//去重
                .collect(Collectors.toList());//收集器
        System.out.println(list);
/// ------------------------------------------------------------------------------------
        List<Integer> collect=list.stream()
                .map(str->str.length())//map是stream里面的一个方法，接收的一个参数是Function<T,R>函数式接口（即接受一个输入T，返回结果R）。
                .collect(Collectors.toList());
        System.out.println(collect);
///----------------------------------------------------------------------------------------
        Random random=new Random();
        random
                .ints(-100,100)//获取int类型随机数(限定范围)
                .limit(10)//限制数量
                .filter(i->i<0)//过滤（只保留小于0的）
                .sorted()//默认从小到大排序
                .forEach(System.out::println);

    }
}
