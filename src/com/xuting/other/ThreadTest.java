package src.com.xuting.other;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2019/3/26 14:49
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class ThreadTest {
    public static void main(String[] args) {
        String[] name= {"李明","王五","张杰","王强","赵二","李四","张三"};
        int[] age= {26,27,33,45,19,23,41};
        for(int i=0;i<7;i++) {
            Thread t1= new SemaphoreDemo.InformationThread(name[i],age[i]);
            SemaphoreDemo.threadPool.execute(t1);
        }
    }
}


