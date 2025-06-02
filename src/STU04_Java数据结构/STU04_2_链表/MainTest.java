package STU04_Java数据结构.STU04_2_链表;

public class MainTest {
    public static void main(String[] args) {
        LinkList<String> list = new LinkList<>();
        list.add("10", 0);
        list.add("20", 0);
        list.add("30", 1);
        System.out.println(list);
    }
}
