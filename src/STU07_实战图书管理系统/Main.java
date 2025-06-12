package STU07_实战图书管理系统;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Book> LIST;

    public static void main(String[] args) {
        System.out.println("初始化");
        load();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1,录入");
            System.out.println("2,查询");
            System.out.println("3,删除");
            System.out.println("4,修改");
            System.out.println("5,退出");

            System.out.print("选择：");
            switch (sc.nextInt()){
                case 1:
                    insert(sc);
                    break;
                case 2:
                    list();
                    break;
                case 3:
                    delete(sc);
                    break;
                case 4:
                    modify(sc);
                    break;
                case 5:
                    System.out.println("正在保存");
                    save();
                    System.out.println("退出");
                    return;
            }

        }
    }
    private static void modify(Scanner sc) {
        sc.nextLine();
        System.out.println("请选择要修改的位置");
        int index = sc.nextInt();
        sc.nextLine();
        while(index>LIST.size()-1||index<0){
            System.out.println("不存在,重输");
            index=sc.nextInt();
            sc.nextLine();
        }

        Book book = LIST.get(index);
        System.out.print("请输入书名(必填，2-100字符)：");
        book.setTitle(sc.nextLine());
        System.out.print("请输入作者(必填，2-50字符)：");
        book.setAuthor(sc.nextLine());
        System.out.print("请输入价格(正整数，单位：元)：");
        book.setPrice(sc.nextInt());
        sc.nextLine();
        System.out.println("修改完成");

    }

    private static void delete(Scanner sc){
        sc.nextLine();
        System.out.println("输入要删除的序号");
        int index=sc.nextInt();
        sc.nextLine();
        while(index>LIST.size()-1||index<0){
            System.out.println("不存在,重输");
            index=sc.nextInt();
            sc.nextLine();
        }
        LIST.remove(index);
        System.out.println("删除完成");
    }

    private static void save(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"))){
            oos.writeObject(LIST);
            oos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void load(){
        File file = new File("data.txt");
        if(file.exists()){
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
                LIST= (List<Book>) ois.readObject();
            }catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
        }else {
            LIST = new LinkedList<>();
        }
    }

    private static void insert(Scanner sc){
       /* String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();*/

        sc.nextLine();//吸收回车，方便接下来正常判断

        //建造者模式
        Book book=Book.builder()
                .title()
                .author()
                .price()
                .build();

        LIST.add(book);
        System.out.println(LIST);
    }

    private static void list(){
        for(int i=0;i<LIST.size();i++){
            System.out.print(i+":");
            System.out.println(LIST.get(i));
        }
    }
}
