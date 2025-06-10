package STU06_JAVAIO.STU06_2_输出流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileOutputStream stream=new FileOutputStream("D:\\juan\\mycode\\javaSE_1\\src\\STU06_JAVAIO\\STU06_2_输出流\\ttt.txt")){
            stream.write('B');
            stream.flush();//刷新
        }catch (IOException e){
            e.printStackTrace();
        }

        try(FileInputStream in=new FileInputStream("D:\\juan\\mycode\\javaSE_1\\src\\STU06_JAVAIO\\STU06_2_输出流\\ccc.txt");
        FileOutputStream out=new FileOutputStream("D:\\juan\\mycode\\javaSE_1\\src\\STU06_JAVAIO\\STU06_2_输出流\\cccccc.txt")){
           byte[] bytes=new byte[1024];
           int len;
            while ((len=in.read(bytes))!=-1) out.write(bytes,0,len);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }