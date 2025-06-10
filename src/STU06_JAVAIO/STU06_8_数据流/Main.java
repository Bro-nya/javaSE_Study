package STU06_JAVAIO.STU06_8_数据流;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(DataInputStream dataInputStream=new DataInputStream(new FileInputStream("ttt.txt"))){
            System.out.println(dataInputStream.readBoolean());//特殊的是，可以直接将数据读取为任意基本类型
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
