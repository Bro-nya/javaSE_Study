package STU04_Java数据结构.STU04_1_顺序表;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //list.add(10, 0);    //一上来只能在第一个位置插入，第二个位置肯定是非法的

        for(int i=0;i<20;i++){//填充数组
            list.add(i,i);
        }

        list.remove(5);
        System.out.println(list);

    }
}
