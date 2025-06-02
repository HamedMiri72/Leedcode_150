package string.removeDuplicate;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,1,2,3,4};

        Solution solution = new Solution();

        int k = solution.removeDuplicate(nums);
        System.out.println(k + " " + Arrays.toString(Arrays.copyOfRange(nums, 0, k)));
    }
}
