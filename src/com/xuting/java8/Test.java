package src.com.xuting.java8;

import src.com.xuting.java8.vo.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2019/7/23 17:53
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class Test {
    public static void main(String[] args) {
        List<Apple> apple = new ArrayList();
        apple.add(new Apple(1, 1));
        apple.add(new Apple(3, 3));
        apple.add(new Apple(2, 2));
        for (Apple apple1 : apple) {
            System.out.println("id:" + apple1.getId() + ",weight:" + apple1.getWeight());
        }
        apple.sort(Comparator.comparing(Apple::getWeight));
        for (Apple apple1 : apple) {
            System.out.println("id:" + apple1.getId() + ",weight:" + apple1.getWeight());
        }
    }
}
