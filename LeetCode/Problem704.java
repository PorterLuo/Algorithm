package LeetCode;

public class Problem704 {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while (low <= high) {
            int mid = high + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target){
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
