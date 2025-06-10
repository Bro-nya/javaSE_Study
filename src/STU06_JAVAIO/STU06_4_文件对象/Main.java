package STU06_JAVAIO.STU06_4_文件对象;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file=new File("D:\\juan\\mycode\\javaSE_1\\src\\STU06_JAVAIO\\STU06_4_文件对象\\sss.txt");
        System.out.println(file.exists());//判断文件是否存在
        System.out.println(file.getAbsolutePath());//获取绝对路径

        File file1=new File("/");
        System.out.println(file1.getFreeSpace()/1024/1024/1024+"G");
    }
}
