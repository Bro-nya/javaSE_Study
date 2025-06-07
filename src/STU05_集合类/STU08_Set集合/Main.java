package STU05_集合类.STU08_Set集合;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set set = new HashSet();//乱序
        set.addAll(Arrays.asList("467", "11", "999"));
        System.out.println(set);

        Set<String> set1 = new LinkedHashSet<>();//维持顺序
        set1.addAll(Arrays.asList("467", "11", "999"));
        System.out.println(set1);

        Set<String> set2 = new TreeSet<>();//插入时自动排序（默认从小到大）
        set2.addAll(Arrays.asList("467", "11", "999"));
        System.out.println(set2);

    }
}
