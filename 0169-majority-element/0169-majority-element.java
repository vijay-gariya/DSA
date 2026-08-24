class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for(int i :nums){
            if(candidate == i){
                count++;
            }else{
                count --;
                if(count == 0){
                    candidate = i;
                    count ++;
                }
            }
        }
        return candidate;
    }
}