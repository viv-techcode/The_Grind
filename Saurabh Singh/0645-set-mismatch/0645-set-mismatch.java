class Solution {
    public int[] findErrorNums(int[] nums) {
        int newarr[] = new int[2];
        Arrays.sort(nums);

        int arr[] = new int[nums.length - 1];
        int k = 0;

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i + 1]) {
                newarr[0] = nums[i];
            }
            else{
                arr[k] = nums[i];
                k++;
            }

        }

        arr[k] = nums[nums.length - 1];

        for(int i = 0; i < arr.length; i++) {

            if(arr[0] != 1){
                newarr[1] = 1;
                break;
            }

            if(i + 1 != arr[i]){
                newarr[1] = i + 1;
                break;
            }

        }

        if(newarr[1] == 0){
            newarr[1] = nums.length;
        }

        return newarr;
    }
}