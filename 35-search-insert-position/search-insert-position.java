
// search insert position
class Solution {
    //swapnill
    public int searchInsert(int[] nums, int target) {
        //initialize two pointer left and right
        int left = 0; 
        int right = nums.length -1;
        // serch keep tange
        while(left<= right){
            //clculte mid of given array
            int mid = left + (right -left) /2;
            
                if(nums[mid]== target){
                  return mid;
                }
                if(nums[mid] < target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            
        }
        return left;
    }
}