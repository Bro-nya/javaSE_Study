package STU07_实战图书管理系统;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {
    private String title;
    private String author;
    private int price;


    private Book(String title, String author, int price) {//构造函数
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book（图书）：\n" +
                "title(标题)：'" + title + '\'' +
                ", author(作者)：'" + author + '\'' +
                ", price(价格)：" + price +
                '}';
    }

    /* public Book(String title, String author, int price) {
             this.title = title;
             this.author = author;
             this.price = price;
         }*/
    public static BookBuilder builder(){
        return new BookBuilder();
    }

    public static class BookBuilder{
        private String title;
        private String author;
        private int price;

        private Scanner sc0 = new Scanner(System.in);

        private BookBuilder(){
        }
        public BookBuilder title(){
            System.out.print("请输入书名(必填，2-100字符)：");
            this.title =sc0.nextLine() ;
            return this;
        }
        public BookBuilder author(){
            System.out.print("请输入作者(必填，2-50字符)：");
            this.author = sc0.nextLine();
            return this;
        }
        public BookBuilder price(){
            System.out.print("请输入价格(正整数，单位：元)：");
            this.price = sc0.nextInt();
            return this;
        }
        public Book build(){
            return new Book(title, author, price);
        }
    }
}