package src.com.xuting.leetCode;

/**
 * @author Miracle Xu
 * @Description: 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 要求：使用空间复杂度为 O(1) 的原地算法。
 * 示例 1:
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * @create: 2019/3/27 15:52
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class Leetcode3 {
    public static void rotate(int[] nums, int k) {
        if (nums.length > 0) {
            k = k % nums.length;
            //颠倒所有元素
            reverse(nums, 0, nums.length - 1);
            //颠倒前面的元素
            reverse(nums, 0, k - 1);
            //颠倒后面的元素
            reverse(nums, k, nums.length - 1);
        }
        for (int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }


    }
    private static void reverse(int[] nums,int begin,int end){
        if (nums.length > 0 && begin < end){
            int temp;
            for (int i = 0 ; i <= (end-begin)/2 ;i++){
                temp = nums[end-i];
                nums[end-i] = nums[begin+i];
                nums[begin+i] = temp;
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
    }

}
