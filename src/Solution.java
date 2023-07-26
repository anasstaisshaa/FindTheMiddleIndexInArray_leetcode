class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for(int n : nums) rightSum += n;
        for(int i = 0; i < nums.length; i ++) {
            rightSum -= nums[i];
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return - 1;
    }
}
