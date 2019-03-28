package src.com.xuting.leetcode;

/**
 * @author Miracle Xu
 * @Description: 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * @create: 2019/3/28 10:57
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class Leetcode5 {
    public static int singleNumber(int[] nums) {
        //异或操作，相同的数异或的结果为0,0和任何值异或的结果为任何值
        int differentNumber = 0;
        for(int i = 0;i<nums.length;i++){
            differentNumber = differentNumber ^ nums[i];
        }
        return differentNumber;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,3,2,1,5};
        System.out.println(singleNumber(nums));
    }
}
