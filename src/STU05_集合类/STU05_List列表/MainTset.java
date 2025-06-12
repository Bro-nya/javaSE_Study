package STU05_集合类.STU05_List列表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainTset {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1=new LinkedList<>(Arrays.asList("a","b","c"));
        list.add("AAAA");
        for (String s : list1) {
            System.out.println(s);
        }
    }
}
