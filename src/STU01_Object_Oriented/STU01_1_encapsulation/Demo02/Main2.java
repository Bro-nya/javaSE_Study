/// 调用自带方法实现：查询，升序排序
package STU01_Object_Oriented.STU01_1_encapsulation.Demo02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);///创建Scanner对象，用于读取用户输入
        List<String>names=Arrays.asList("jack","tony","rose");///动态数组
        System.out.print("请输入要查询的姓名：");
        String inputName = scanner.next();///读取用户输入名字（空格，换行结束）
    }
}
