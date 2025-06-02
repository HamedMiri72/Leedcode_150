package string.majority;

import java.util.HashMap;

public class Solution {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int majority = 0;
         int result = 0;

        for(int n : nums){
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
            if (hashMap.get(n) > majority){
                result = n;
                majority = hashMap.get(n);
            }
        }
        return result;
    }

}
