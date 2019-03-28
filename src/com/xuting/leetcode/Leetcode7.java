package src.com.xuting.leetcode;

/**
 * @author Miracle Xu
 * @Description: 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * @create: 2019/3/28 15:29
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class Leetcode7 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1;i>=0;i--){
            if (digits[i] == 9){
                digits[i] = 0;
                continue;
            }else {
                digits[i]++;
                break;
            }
        }
        if (digits[0] == 0){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            System.arraycopy(digits,0,result,1,digits.length);
            return result;
        }else {
            return digits;
        }
    }

    public static void main(String[] args){
        int[] digits = {9,9,9,1};
        int[] result = plusOne(digits);
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
