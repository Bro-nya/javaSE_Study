package STU04_Java数据结构.STU04_1_顺序表;

public class ArrayList<E> {   //泛型E，因为表中要存的具体数据类型待定
    int capacity = 10;   //当前顺序表的容量
    int size = 0;   //当前已经存放的元素数量
    private Object[] array = new Object[capacity];   //底层存放数据的数组

    public void add(E element, int index){
        if(index < 0 || index > size)    ///插入之前先判断插入位置是否合法
            throw new IndexOutOfBoundsException("插入位置非法，合法的插入位置为：0 ~ "+size);//插入方法需要支持在指定下标位置插入

        if(capacity == size) {/// 满了要扩容
            int newCapacity = capacity + (capacity >> 1);   //扩容规则就按照原本容量的1.5倍来吧，>>：右移一位，
            Object[] newArray = new Object[newCapacity];    //创建一个新的数组来存放更多的元素
            System.arraycopy(array, 0, newArray, 0, size);   //使用arraycopy快速拷贝原数组内容到新的数组
            array = newArray;   //更换为新的数组
            capacity = newCapacity;   //容量变成扩容之后的
        }

        for (int i = size; i > index; i--)   ///从后往前，一个一个搬运元素
            array[i] = array[i - 1];
        array[index] = element;   //腾出位置之后，直接插入元素放到对应位置上
        size++;   //插入完成之后，记得将size自增
    }


    @SuppressWarnings("unchecked")//屏蔽未经检查警告
    public E remove(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("删除位置非法，合法的删除位置为：0 ~ "+(size - 1));
        E e = (E) array[index];
        for (int i = index; i < size; i++)
            array[i] = array[i + 1];
        size--;
        return e;
    }

    @SuppressWarnings("unchecked")
    public E get(int index){//查找
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("查找位置非法，合法的查找位置为：0 ~ "+(size - 1));
        return (E) array[index];
    }


    public String toString() {///重写tiString（）方法，才能打印出当前存放的数组
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) builder.append(array[i]).append(" ");
        return builder.toString();
    }

}
