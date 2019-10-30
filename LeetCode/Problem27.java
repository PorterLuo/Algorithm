/**
 * 给定一个数组 nums 和一个值 val
 * 你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *
 */
package LeetCode;

public class Problem27 {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; ++j) {
            if(val != nums[j]) {
              nums[i] = nums[j];
              ++i;
            }
        }
        return i;
    }
}
