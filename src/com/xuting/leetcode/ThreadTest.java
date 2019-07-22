package src.com.xuting.leetcode;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2019/4/1 15:55
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class ThreadTest {
        private static final long count = 10000L;
        public static void main(String[] args) throws InterruptedException {
            concurrency();
//            serial();
        }
        private static void concurrency() throws InterruptedException {
            long start = System.currentTimeMillis();
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int a = 0;
                    for (long i = 0; i < count; i++) {
                        a += 5;
                    }
                }
            });
            thread.start();
            int b = 0;
            for (long i = 0; i < count; i++) {
                b--;
            }
            long time = System.currentTimeMillis() - start;
            thread.join();
            System.out.println("concurrency :" + time+"ms,b="+b);
        }
        private static void serial() {
            long start = System.currentTimeMillis();
            int a = 0;
            for (long i = 0; i < count; i++) {
                a += 5;
            }
            int b = 0;
            for (long i = 0; i < count; i++) {
                b--;
            }
            long time = System.currentTimeMillis() - start;
            System.out.println("serial:" + time+"ms,b="+b+",a="+a);
        }
}
