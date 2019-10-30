/**
 * 给定一个包含 n + 1 个整数的数组 nums，
 * 其数字都在 1 到 n 之间（包括 1 和 n），
 * 可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数
 *
 *
 */
package LeetCode;

import java.util.Arrays;

public class Problem287 {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && i + 1 < nums.length; ++i) {
            if (nums[i] == nums[i+1] ) {
                return nums[i];
            }
        }
        return -1;
    }

}
