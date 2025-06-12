package STU08_多线程.Main5线程锁和线程同步;

public class Main5 {
    private static int value = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) value++;
            System.out.println("线程1完成");
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) value++;
            System.out.println("线程2完成");
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);  //主线程停止1秒，保证两个线程执行完成
        System.out.println(value);//难以到达2万， 参考png理解，高速缓存可能从主内存中读取一样的数据交给各自cpu处理，导致了可能对一样的数据进行了执行
    }
}
