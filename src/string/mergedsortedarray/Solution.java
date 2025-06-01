package string.mergedsortedarray;

public class Solution {

    public void merger(int[] nums1, int m, int[] nums2, int n){

        int midx = m -1;
        int nidx = n - 1;
        int right = m + n - 1;

        while(nidx >= 0){
            if(midx >= 0 && nums2[nidx] > nums1[midx]){
                nums1[right] = nums2[nidx];
                nidx--;
            }else{
                nums1[right] = nums1[midx];
                midx--;
            }
            right--;
        }

    }
}
