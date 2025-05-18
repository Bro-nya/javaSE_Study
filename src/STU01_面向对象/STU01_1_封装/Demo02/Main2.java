/// 调用自带方法实现：查询，升序排序
package STU01_面向对象.STU01_1_封装.Demo02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);///创建Scanner对象，用于读取用户输入
        List<String>names=Arrays.asList("jack","tony","rose");///动态数组
        System.out.print("请输入要查询的姓名：");
        String inputName = scanner.next();///读取用户输入名字（空格，换行结束）

        ///  查找
        if(names.contains(inputName)){
            System.out.println("查到此人");
        }else {
            System.out.println("查无此人");
        }

        /// 排序
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
