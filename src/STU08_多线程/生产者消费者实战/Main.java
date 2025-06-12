package STU08_多线程.生产者消费者实战;

import java.util.Date;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Main {
    private static Queue<Object> queue= new LinkedList<>();

    public static void main(String[] args) {
        new Thread(Main::add,"厨师1").start();
        new Thread(Main::add,"厨师2").start();

        new Thread(Main::take,"消费者1").start();
        new Thread(Main::take,"消费者2").start();
        new Thread(Main::take,"消费者3").start();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);
                    synchronized (queue) {
                        System.out.println("当前队列大小: " + queue.size());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "监控线程").start();
    }

    private static void add() {
        while (true){
            try {
                Thread.sleep(3000);
                synchronized (queue) {
                    String s=Thread.currentThread().getName();
                    System.out.println(new Date()+" "+s+"出餐");
                    queue.offer(new Object());
                    queue.notify();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private static void take() {
        while (true){
            try{
                synchronized (queue) {
                while (queue.isEmpty()) {
                    queue.wait();
                }
                    queue.poll();
                    String s = Thread.currentThread().getName();
                    System.out.println(new Date() + " " + s + "开炫");
                    Thread.sleep(4000);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
