package LeetCode;

public class Problem362 {
    public static void main(String[] args) {

    }

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n = n /3;
        }
        return  n == 1;
    }
}
