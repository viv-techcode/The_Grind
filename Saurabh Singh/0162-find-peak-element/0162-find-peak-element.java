class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while(i<j){
            int peak = (i+j)/2;

            if(nums[peak]<nums[peak+1]){
                i = peak+1;
            }
            else{
                j = peak;
            }
        }
        return i;
    }
}