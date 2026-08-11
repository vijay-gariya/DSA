class Solution {
    //swapnill
    public int[] sortedSquares(int[] nums) {
        //two pointer approach
        int l = 0; //i
        int r = nums.length-1; //j
        //add new arry for store result
        int[] res = new int[nums.length];
        for(int i = nums.length-1; i>=0; i--){
            //Check its modeules maths.abs 
            if(Math.abs(nums[l]) > Math.abs(nums[r])){ // i>j
                //store in result nums legt's squre
                res[i]= nums[l] * nums[l]; // nums i*2
                l++; // i

            }else{
                res[i] = nums[r] * nums[r];
                r--;
            }
        }
        return res;
    }
}