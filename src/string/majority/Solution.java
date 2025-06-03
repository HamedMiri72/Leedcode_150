package string.majority;

import java.util.HashMap;

public class Solution {


    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hash = new HashMap<>();

        int majority = 0;
        int result = 0;

        for (int n: nums){
            hash.put(n, hash.getOrDefault(n, 0) + 1);
            if(hash.get(n)> majority ){
                majority = hash.get(n);
                result = n;
            }
        }
        return result;
    }

}
