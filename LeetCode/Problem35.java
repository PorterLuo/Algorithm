/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置
 */
package LeetCode;

public class Problem35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left <= right) {
            int mid = left + ((right - left) >> 1);
            if(nums[mid] > target) {
                right = mid -1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right + 1;
    }

    public int searchInsert1(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right) {
            int mid = left + ((right - left) >> 1);
            if(nums[mid] > target) {
                right = mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
