class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];
    Arrays.sort(nums);

        int newarr[] = new int[nums.length-1];
        int k = 0;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                arr[0] = nums[i];
               
            }
            else{
                newarr[k] = nums[i];
                k++;
            }
            
        }

          for(int i = 0;i<newarr.length;i++){
            

            if(newarr[0]!=1){
                arr[1] = 1;
                break;
            }

            if(newarr[i]!=i+1){
                arr[1]=i+1;
                break;
            }
        }
      
        return arr;
    }
}