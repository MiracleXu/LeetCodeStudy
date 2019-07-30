package src.com.xuting.java8.utils;

import src.com.xuting.java8.vo.Apple;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2019/7/26 16:25
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class ApplePrintColorPredicate implements ApplePrintPredicate {
    @Override
    public String print(Apple apple) {
        return "id:" + apple.getId() + ",weight:" + apple.getWeight();
    }
}
