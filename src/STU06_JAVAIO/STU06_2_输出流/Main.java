package STU06_JAVAIO.STU06_2_输出流;

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
    }
}
