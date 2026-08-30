class Solution {
    public int maxArea(int[] height) {
        int i = 0; //left
        int j = height.length - 1; // right
        int maxCap = 0;

        while (i < j) {
            int ht = Math.min(height[i], height[j]);
            int wd = j - i;
            int currCap = ht * wd;

            maxCap = Math.max(currCap, maxCap);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxCap;
    }
}
