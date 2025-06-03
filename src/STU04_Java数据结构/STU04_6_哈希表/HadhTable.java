package STU04_Java数据结构.STU04_6_哈希表;


public class HadhTable<E> {
    private final int TABLE_SIZE=10;
    private final Node<E>[] TABLE =new Node[TABLE_SIZE];

    public HadhTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            TABLE[i]=new Node<>(null);
        }
    }

    public void insert(E e){
        int index=hash(e);
        Node<E> head=TABLE[index];
        Node<E> node=new Node<>(e);
        node.next=head.next;
        head.next=node;
    }

    public boolean contains(E e){
        int index=hash(e);
        Node<E> node=TABLE[index].next;
        while (node!=null){
            if(node.data==e)
                return true;
            node=node.next;
        }
        return false;
    }

  /*  public boolean contain(E e){
        int index=hash(e);
        return TABLE[index]==e;
    }*/

    private  int hash(E obj){
        int hashCode=obj.hashCode();
        return hashCode%TABLE_SIZE;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < TABLE_SIZE; i++) {
            Node<E> head=TABLE[i].next;
            while (head!=null){
                builder.append(head.data).append("->");
                head=head.next;
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
