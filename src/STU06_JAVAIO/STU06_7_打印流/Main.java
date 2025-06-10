package STU06_JAVAIO.STU06_7_打印流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try(PrintStream stream=new PrintStream(new FileOutputStream("ttt.txt"))){
            stream.println("AFJDFLAJDLFJA");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
