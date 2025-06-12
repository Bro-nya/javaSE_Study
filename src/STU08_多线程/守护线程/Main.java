package STU08_多线程.守护线程;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            public void run() {
                try{
                    while(true){
                        System.out.println("守护");
                        Thread.sleep(1000);
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        t.setDaemon(true);//设定守护线程，当其他非守护线程结束，将自动结束（守护线程中产生的线程也是守护线程）
        t.start();

        Thread.sleep(3000);
    }
}
