package STU05_集合类.STU06_迭代器;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Maintest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j"));
        Iterator<String> iterator = list.iterator();//创建一个迭代器
        System.out.println(iterator.next());
        System.out.println("监测");
        System.out.println(iterator.next());
        System.out.println("监测");
        iterator.forEachRemaining(System.out::println);
        System.out.println(list);
    }
}
