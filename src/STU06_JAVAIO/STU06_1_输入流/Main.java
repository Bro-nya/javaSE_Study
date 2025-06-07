package STU06_JAVAIO.STU06_1_输入流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        ///臃肿的文件输入流
        FileInputStream stream = null;//定义在这里作用域让finally的close访问得到
        try {
           stream = new FileInputStream("C:\\Users\\tianxuanji\\Desktop\\test.txt");
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if(stream!=null) {
                try {
                    stream.close();//释放文件
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        /// 以下为上面的语法糖
        try(FileInputStream stream1=new FileInputStream("C:\\Users\\tianxuanji\\Desktop\\test.txt")){
            System.out.println(stream1);
            int i=stream1.read();//一次读1个字节（8个比特位）没内容后会返回-1
            System.out.println((char)i);
            int j=stream1.read();
            System.out.println((char)j);
            int x;
            while((x=stream1.read())!=-1){
                System.out.print((char)x);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        ///
        try(FileInputStream stream2=new FileInputStream("C:\\Users\\tianxuanji\\Desktop\\test.txt")){
            byte[] bytes = new byte[stream2.available()];
            stream2.read(bytes);
            System.out.println("\n");
            System.out.println(new String(bytes));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
