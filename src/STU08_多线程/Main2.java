package STU08_多线程;
///中断标记
public class Main2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("进入thread1");
                try{
                    Thread.sleep(10000);
                }catch(InterruptedException e){
                    System.out.println("1被中断");
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("进入thread2");
               while(true){
                   if(Thread.currentThread().isInterrupted())/*判断是否被打中断标记*/{
                       System.out.println("2也被中断");
                       break;
                   }
               }
            }
        });

        thread.start();
        thread2.start();
        try{
            Thread.sleep(3000);
            thread.interrupt();//中断标记
            Thread.sleep(3000);
            thread2.interrupt();//中断标记
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
