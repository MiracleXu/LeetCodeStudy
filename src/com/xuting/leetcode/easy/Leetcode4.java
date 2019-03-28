package src.com.xuting.leetcode.easy;

import java.util.HashMap;

/**
 * @author Miracle Xu
 * @Description: 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: true
 * @create: 2019/3/27 18:10
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class Leetcode4 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length>0){
            HashMap temp = new HashMap();
            for (int i = 0;i<nums.length;i++){
                temp.put(nums[i],nums[i]);
            }
            if (temp.size() < nums.length){
                return true;
            }
        }
        return false;
    }
}
