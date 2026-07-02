class Solution {
    public int longestOnes(int[] nums, int k) {
        int cof=0;
        int  l =0;
        int r = 0 ;
                int maxLen = 0;

for(int right = 0 ; right < nums.length ; right++){

        if(nums[right] == 0){
            cof++ ;
        }

        while( cof > k){

            if(nums[l] == 0 ){

                cof--;
            }
            l++;
        }
            maxLen = Math.max(maxLen, right - l + 1);
    }

        return maxLen;

}
}