package STU06_JAVAIO.STU06_6_转换流;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader stream= new BufferedReader(new InputStreamReader(new FileInputStream("ttt.txt")))){
            System.out.println(stream.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
