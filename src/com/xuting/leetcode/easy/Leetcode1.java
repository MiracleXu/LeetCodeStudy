package src.com.xuting.leetcode.easy;

/**
 * @author Miracle Xu
 * @Description: 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @create: 2019/3/26 16:00
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class Leetcode1 {
    public static int removeDuplicates(int[] nums) {
        int newLength = 0;
        int temp = 0;
        if (nums.length > 0){
            for (int i = 0 ; i < nums.length ; i++){
                if (i == 0) {
                    temp = nums[i];
                    newLength = i;
                }else {
                    if (temp == nums[i]){
                        continue;
                    }else {
                        newLength++;
                        nums[newLength] = nums[i];
                        temp = nums[i];
                    }
                }
            }
            for (int x = 0; x< newLength + 1;x++){
                System.out.println(nums[x]);
            }
        }
        return newLength+1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,};
        System.out.println(removeDuplicates(nums));
    }
}
