package LeetCode;

public class Problem55 {
    public boolean canJump(int[] nums) {
        int cover = 0;
        for(int i = 0; i <= cover; ++i) {
            cover = Math.max(nums[i] + i, cover);
            if(cover >= nums.length -1) {
                return true;
            }
        }
        return false;
    }
}
