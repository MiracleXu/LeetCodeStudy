package src.com.xuting.java8;

import src.com.xuting.java8.utils.ApplePrintColorPredicate;
import src.com.xuting.java8.utils.ApplePrintWeightPredicate;
import src.com.xuting.java8.vo.Apple;

import java.util.ArrayList;
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
        List<Apple> appleList = new ArrayList();
        appleList.add(new Apple(1,10,"green"));
        appleList.add(new Apple(2,20,"red"));
        appleList.add(new Apple(3,20,"green"));
        appleList.add(new Apple(4,10,"red"));

        List<Apple> result = filter(appleList, (Apple a) -> a.getWeight() > 10 );
        print(result);

        result = appleList.stream().filter((Apple a) -> "green".equals(a.getColor())).collect(Collectors.toList());
        print(result);

        prettyPrintApple(appleList,new ApplePrintWeightPredicate());
        prettyPrintApple(appleList,new ApplePrintColorPredicate());
    }
}
