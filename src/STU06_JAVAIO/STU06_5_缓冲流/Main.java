package STU06_JAVAIO.STU06_5_缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(BufferedInputStream stream=new BufferedInputStream(new FileInputStream("D:\\juan\\mycode\\javaSE_1\\src\\STU06_JAVAIO\\STU06_3_文件字符流\\test.txt"),10/*00设定缓冲区大小（默认 8192 字节*/)){
            stream.mark(0/*设定后续能回退的最大字节数量，设定0为当作当前缓冲区大小*/);
            System.out.print((char)stream.read());
            System.out.print((char)stream.read());
            System.out.print((char)stream.read());
            System.out.print((char)stream.read());
            stream.reset();//如果超过可回退数再调用，会报错
            System.out.println("\n");
            System.out.println((char)stream.read());

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
