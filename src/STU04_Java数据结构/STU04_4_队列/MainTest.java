package STU04_Java数据结构.STU04_4_队列;

public class MainTest {
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
