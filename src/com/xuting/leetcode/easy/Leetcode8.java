package src.com.xuting.leetcode.easy;

/**
 * @author Miracle Xu
 * @Description: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * @create: 2019/3/28 17:18
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class Leetcode8 {
    public static void moveZeroes(int[] nums) {
        int begin = -1;
        int temp;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] != 0){
                if (begin > -1){
                    temp = nums[i];
                    nums[i] = nums[begin];
                    nums[begin] = temp;
                    begin++;
                }
            }else {
                if (begin == -1){
                    begin = i;
                }
            }
        }
        for (int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args){
        int[] nums = {0,0,1,0,1,2,0,0,2,0};
//        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
