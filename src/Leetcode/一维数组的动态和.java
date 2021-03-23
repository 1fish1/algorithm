package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 输入：nums = [1,1,1,1,1]
 * 输出：[1,2,3,4,5]
 * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 一维数组的动态和 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int B[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            B[i] = nums[i];
        }
//        System.out.println(Arrays.toString(B));

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int k = 0; k < i; k++) {
                temp += B[k];
            }
            nums[i] += temp;
        }

        System.out.println(Arrays.toString(nums));

    }
}