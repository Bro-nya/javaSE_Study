package STU08_多线程.结合集合类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list
                .parallelStream()
                .forEach(i -> System.out.println(Thread.currentThread().getName()));
    }
}
