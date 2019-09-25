package src.com.xuting.java8;

import src.com.xuting.java8.utils.ApplePrintColorPredicate;
import src.com.xuting.java8.utils.ApplePrintWeightPredicate;
import src.com.xuting.java8.vo.Apple;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static src.com.xuting.java8.utils.AppleUtils.*;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2019/7/25 17:41
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class AppleTest {
    public static void main(String[] args) {

//        Apple a1 = new Apple(1, 10, "green");
//        Apple a2 = new Apple(2, 5, "red");

        List<Apple> appleList = new ArrayList();
        appleList.add(new Apple(1, 10, "green"));
        appleList.add(new Apple(2, 20, "red"));
        appleList.add(new Apple(3, 25, "green"));
        appleList.add(new Apple(4, 15, "red"));

        List<Apple> result = filter(appleList, (Apple a) -> a.getWeight() > 10);
        print(result);

        result = appleList.stream().filter((Apple a) -> "green".equals(a.getColor())).collect(Collectors.toList());
        print(result);

        prettyPrintApple(appleList, new ApplePrintWeightPredicate());
        prettyPrintApple(appleList, new ApplePrintColorPredicate());

        int weighter = weightFilter(appleList, (Apple a, int b) -> a.getWeight() > b ? a.getWeight() : b);
        System.out.println(weighter);

        Comparator<Apple> appleComparator = Comparator.comparing(Apple::getColor);

    }
}
