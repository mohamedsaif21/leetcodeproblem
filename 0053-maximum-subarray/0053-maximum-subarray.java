class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize maxSum to the first element index zero
        int maxSum = nums[0];
        int currentSum = 0;
        
        for (int num : nums) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
