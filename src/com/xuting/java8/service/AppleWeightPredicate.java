package src.com.xuting.java8.service;

import src.com.xuting.java8.vo.Apple;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2019/7/31 16:30
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public interface AppleWeightPredicate<T> {
    int weighter(T a,int b);
}
