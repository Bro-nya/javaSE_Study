package STU05_集合类.STU11_Collections工具类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,45,4,6,6));
        System.out.println(Collections.max(list));
    }
}
