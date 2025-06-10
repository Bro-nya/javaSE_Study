package STU06_JAVAIO.STU06_3_文件字符流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("当前工作目录: " + System.getProperty("user.dir"));
        try(FileReader reader=new FileReader("D:\\juan\\mycode\\javaSE_1\\src\\STU06_JAVAIO\\STU06_3_文件字符流\\test.txt")){
            System.out.println((char) reader.read());
        }catch (IOException e){
            e.printStackTrace();
        }

        try(FileReader reader1=new FileReader("D:\\juan\\mycode\\javaSE_1\\src\\STU06_JAVAIO\\STU06_3_文件字符流\\test.txt");
            FileWriter writer1=new FileWriter("D:\\juan\\mycode\\javaSE_1\\src\\STU06_JAVAIO\\STU06_3_文件字符流\\test1.txt")){
            char[] chars=new char[3];
            int len;
            while ((len=reader1.read(chars))!=-1){
                writer1.write(chars,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
