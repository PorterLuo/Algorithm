/**
 * 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
 * 必须在原数组上操作，不能拷贝额外的数组
 * 尽量减少操作次数
 */
package LeetCode;

public class Problem283 {
    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; ++j) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                ++i;
            }
        }
    }
}
