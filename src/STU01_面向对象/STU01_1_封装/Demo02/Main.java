package STU01_面向对象.STU01_1_封装.Demo02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);///创建Scanner对象，用于读取用户输入
        String[] names={"jack","tony","rose"};
        System.out.print("请输入要查询的姓名：");
        String inputName = scanner.next();///读取用户输入名字（空格，换行结束）

        /// 优化：增强鲁棒性（输入校验）
//        if (scanner.hasNext()) { // 确保有输入
//            String inputName = scanner.next();
//        }
        /// ————————————————————————————————————

        boolean flag = false;
        for(int i=0;i<names.length;i++){
            if(inputName.equals(names[i])){
                flag = true;
                break;
            }
        }

        ///优化： 使用 for-each 循环（更简洁）
//        for (String name : names) {
//            if (inputName.equals(name)) {
//                flag = true;
//                break;
//            }
//        }
        /// ————————————————————————————

        if(flag){
            System.out.println("查询到此人");
        }else {
            System.out.println("查无此人");
        }

        /// 升序冒泡排序
        for(int i=1;i<names.length;i++){
            int exchange=0;
            for(int j=0;j<names.length-i;j++){
                if(names[j].compareTo(names[j+1])>0){
                    String tempStr=names[j];
                    names[j]=names[j+1];
                    names[j+1]=tempStr;
                    exchange=1;
                }
            }
            if(exchange==0){
                break;
            }
        }
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        /// —————————————————————————————————

    }
}
