package STU05_集合类.STU12_集合类对象相等判定;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        String str=new String("AAA");
        System.out.println(list.contains(str));
    }
}
