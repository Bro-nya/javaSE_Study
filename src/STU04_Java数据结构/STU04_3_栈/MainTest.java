package STU04_Java数据结构.STU04_3_栈;

public class MainTest {
    public static void main(String[] args) {
        LinkedStack<String> list = new LinkedStack<>();
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        while (!list.isEmpty()){
            System.out.println(list.pop());
        }
    }
}
