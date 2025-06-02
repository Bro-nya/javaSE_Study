package STU04_Java数据结构.STU04_4_队列;

import java.util.NoSuchElementException;

public class LinkedQueue<E> {
    private final LinkedQueue.Node<E> head=new LinkedQueue.Node<>(null);

    public void offer(E e){
        Node<E> tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=new Node<>(e);
    }

    public E poll(){
        if(isEmpty()){
            throw new NoSuchElementException("队列为空");
        }
        E e=head.next.data;
        head.next=head.next.next;
        return e;
    }

    public E peek(){
        if(isEmpty()){
            throw new NoSuchElementException("队列为空");
        }
        return head.next.data;
    }

    public boolean isEmpty() {
        return head.next==null;
    }

    private static class Node<E>{
        private E data;
        private LinkedQueue.Node<E> next;
        public Node(E data) {
            this.data = data;
        }
    }
}
