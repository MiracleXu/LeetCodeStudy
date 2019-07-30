package src.com.xuting.thread;

/**
 * @author Miracle Xu
 * @Description: 死锁
 * @create: 2019/7/22 17:18
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class ThreadLock1 {
    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    try {
                        Thread.sleep(2000);
                        System.out.println("1");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println("2");
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                        System.out.println("3");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
