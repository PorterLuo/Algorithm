package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Problem268 {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        for (int i = 0; i <= nums.length; ++i) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public int missingNumber1(int[] nums) {
        int mis = nums.length;
        for(int i = 0; i < nums.length; ++i) {
            mis = mis ^ i ^ nums[i];
        }
        return mis;
    }
}
