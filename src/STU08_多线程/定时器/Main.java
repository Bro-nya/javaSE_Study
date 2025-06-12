package STU08_多线程.定时器;

import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
     Timer timer = new Timer();
     timer.schedule(new TimerTask() {
         public void run() {
             System.out.println("wsycrw");
         }
     },3000,/*延迟时间*/1000/*间隔循环*/);
     try{
         sleep(10000);
     }catch(Exception e){
         e.printStackTrace();
     }
     timer.cancel();//取消
    }
}
