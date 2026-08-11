class Solution {
    public void moveZeroes(int[] nums) {
        //swapnill
        //Two Pointer approach
       int i = 0;
       for(int j = 0; j<nums.length; j++){
        //check 0
        if(nums[j]!=0){
            //swap
            swap(nums, i, j);
            //increse i variable
            i++;
        }
       } 
    }
    //Write a swapping function with temp variable;
    public void swap(int[] arr, int i, int j){
        //Then swap each
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
}