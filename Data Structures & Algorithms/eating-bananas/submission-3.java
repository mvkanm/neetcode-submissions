class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile : piles){
            high = Math.max(pile, high);
        }
        int res = high;

        while(low <= high){
            int k = low + (high - low) / 2;
            int totalHours = 0;
            for(int pile : piles){
                totalHours += (pile + k - 1) / k;
            }
            
            if(totalHours <= h){
                res = k;
                high = k - 1;
            }else{
                low = k + 1;
            }
        }
        return res;
    }
}
// h = 8
// [3, 6, 7, 11, 13, 15]
//  l     k           h 

// h = 9
// [1, 2, 3, 4]
//  l  k     h         
