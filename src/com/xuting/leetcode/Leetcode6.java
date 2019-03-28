package src.com.xuting.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Miracle Xu
 * @Description: 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1:
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * @create: 2019/3/28 11:08
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class Leetcode6 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a = 0;
        int b = 0;
        List<Integer> temp = new ArrayList();
        while (a < nums1.length && b < nums2.length){
            if (nums1[a] == nums2[b]){
                temp.add(nums1[a]);
                a++;
                b++;
            }else if (nums1[a] < nums2[b]){
                a++;
            }else {
                b++;
            }
        }
        int[] result = new int[temp.size()];
        if (temp.size() > 0){
            for (int i = 0 ;i < temp.size(); i++){
                result[i] = temp.get(i);
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] array1 = { 2, 1 ,2,1,2,3,3,4,5,6};
        int[] array2 = { 1, 2,2,2,6,1 };
        int[] result = intersect(array1, array2);
        for (int i = 0 ;i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
