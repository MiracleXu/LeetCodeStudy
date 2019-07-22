package src.com.xuting.leetcode;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2019/3/29 17:11
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class MatchTest {
    public static int bitwiseComplement(int N) {

        char[] x = Integer.toBinaryString(N).toCharArray();
        char[] y = new char[x.length];
        for (int i = 0;i<x.length;i++){
            if (x[i] == '0'){
                y[i] = '1';
            }else {
                y[i] = '0';
            }
        }
        String s = String.valueOf(y);
        int result = Integer.parseInt(s,2);
        return result;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(bitwiseComplement(4));
    }

}
