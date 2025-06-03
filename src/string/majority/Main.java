package string.majority;

public class Main {

    public static void main(String[] args){


        int[] nums = {1,1,1,1,1,1,2,2,2,2,2,4,4,4,4,};


        Solution solution = new Solution();

        int result = solution.majorityElement(nums);


        System.out.println(result);

    }
}
