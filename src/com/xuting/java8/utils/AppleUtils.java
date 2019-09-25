package src.com.xuting.java8.utils;

import src.com.xuting.java8.service.ApplePredicate;
import src.com.xuting.java8.service.ApplePrintPredicate;
import src.com.xuting.java8.service.AppleWeightPredicate;
import src.com.xuting.java8.vo.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2019/7/25 17:34
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class AppleUtils {
    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 10;
    }

    public static void print(List<Apple> list) {
        for (Apple apple1 : list) {
            System.out.println("id:" + apple1.getId() + ",weight:" + apple1.getWeight());
        }
    }

    public static <T> List<T> filter(List<T> inventory, ApplePredicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T t : inventory) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, ApplePrintPredicate applePrintPredicate) {
        for (Apple apple : inventory) {
            String output = applePrintPredicate.print(apple);
            System.out.println(output);
        }
    }

    public static <T> int weightFilter(List<T> list, AppleWeightPredicate<T> p) {
        int weighter = 0;
        for (T t : list) {
            weighter = p.weighter(t, weighter);
        }
        return weighter;
    }
}



