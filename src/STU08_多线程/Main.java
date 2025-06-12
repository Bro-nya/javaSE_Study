package STU08_多线程;

public class Main {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            public void run() {
                int sum=0;
                for (int i=1;i<=50;i++){
                    sum+=i;
                }
                System.out.println(sum);
            }
        });
        t.start();//运行
    }
}
