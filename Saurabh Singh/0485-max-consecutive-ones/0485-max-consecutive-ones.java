class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
int count = 0;
int maxcons = 0;
for(int i = 0;i < nums.length;i++){
    
    if(nums[i]!=0){
        count++;
         maxcons = Math.max(maxcons, count);
    }
    else{
      
        count=0;
    }
}

return maxcons;
    }
}