package STU06_JAVAIO.STU06_9_对象流;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ttt.txt"));
             ObjectInputStream in=new ObjectInputStream(new FileInputStream("ttt.txt"))) {
            List<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
            objectOutputStream.writeObject(list);
            ArrayList i=(ArrayList)in.readObject();
            System.out.println(i);
            System.out.println(i.get(0));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream  o= new ObjectOutputStream(new FileOutputStream("ttt.txt"));
             ObjectInputStream i=new ObjectInputStream(new FileInputStream("ttt.txt"))) {
            Student student=new Student();
            student.name="老师";
            o.writeObject(student);
            System.out.println(i.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static class Student implements Serializable {//加了这个接口才能用自创类数据
        String name;
    }
    
}
