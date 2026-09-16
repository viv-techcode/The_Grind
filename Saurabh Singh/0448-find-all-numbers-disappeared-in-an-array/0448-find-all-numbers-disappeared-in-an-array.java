import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        int j = 0;

        for(int i = 1; i <= nums.length; i++) {

            while(j < nums.length - 1 && nums[j] == nums[j + 1]) {
                j++;
            }

            if(j >= nums.length || nums[j] != i) {
                ans.add(i);
            } else {
                j++;
            }
        }

        return ans;
    }
}