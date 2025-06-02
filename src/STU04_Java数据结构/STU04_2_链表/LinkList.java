package STU04_Java数据结构.STU04_2_链表;

public class LinkList<E> {
    //链表头节点
    private final Node<E> head = new Node<>(null);
    private int size = 0;   //当前的元素数量存一下，方便后面操作

    private static class Node<E>{//节点，类，只供内部使用
        private E element;//节点存放的数据
        Node<E> next;//指向下个节点的《引用》
        public Node(E element) {//构造函数
            this.element = element;
        }
    }

    public void add(E element, int index) {
        Node<E> prev =head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
            System.out.println(i);
        }
        Node<E> newNode=new Node<>(element);
        System.out.println("该检索节点链接的下一个节点为"+prev.next);
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
        System.out.println("插入完成");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<E> node = head.next;   //从第一个结点开始，一个一个遍历，遍历一个就拼接到字符串上去
        while (node != null) {
            builder.append(node.element).append(" ");
            node = node.next;
        }
        return builder.toString();
    }
}
