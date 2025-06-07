package STU05_集合类.STU09_Map映射;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();///一个键对应一个信息
        map.put(1,"小明");
        map.put(2,"小红");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("小明"));
        map.compute(1,(k,v)->{
            return v+"aaa";
        });
        System.out.println(map.get(1));

    }
}
