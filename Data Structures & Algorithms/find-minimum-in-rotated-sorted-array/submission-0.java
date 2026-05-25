class Solution {
    public int findMin(int[] nums) {
        // int low = 0;
        // int high = nums.length - 1;
        // while(low <= high){
        //     int mid = low + (high - mid) / 2;
        //     if()
        // }
        int min = nums[0];
        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}
