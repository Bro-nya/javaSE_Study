package STU04_Java数据结构.STU04_3_栈;

import java.util.NoSuchElementException;

public class LinkedStack<E> {
    private final Node<E> head=new Node<>(null);

    public void push(E e) {
        Node<E> newNode=new Node<>(e);
        newNode.next=head.next;
        head.next=newNode;
    }

    public E pop() {
        if(isEmpty())
            throw new NoSuchElementException("栈为空");
        E e=head.next.data;
        head.next=head.next.next;
        return e;
    }

    public boolean isEmpty() {
        return head.next==null;
    }

    private static class Node<E>{
        private E data;
        private Node<E> next;
        public Node(E data) {
            this.data = data;
        }
    }
}
