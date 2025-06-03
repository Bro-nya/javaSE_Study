package STU04_Java数据结构.STU04_6_哈希表;

public class MainTest {
    public static void main(String[] args) {
        HadhTable<String> table = new HadhTable<>();
        /*System.out.println( table.contains("AAA"));
        table.insert("AAA");
        System.out.println( table.contains("AAA"));*/

        for (int i = 0; i < 100; i++) {
            table.insert(String.valueOf(i));
        }
        System.out.println(table+"\n");

        HadhTable<Integer> table2 = new HadhTable<>();///Integer的哈希值比较特殊，为对应位置
        for (int i = 0; i < 100; i++) {
            table2.insert(i);
        }
        System.out.println(table2+"\n");
    }
}
