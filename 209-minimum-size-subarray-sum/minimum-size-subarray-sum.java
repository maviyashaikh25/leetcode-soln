import java.util.*;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {


int sum = 0 ; 
int l = Integer.MAX_VALUE ;
int left =0;
int r = 0 ;


for ( int right =0 ; right < nums.length ; right++){


    sum+=nums[right];


    while(sum >= target){


        l = Math.min(l, right - left + 1);
        sum-=nums[left];
        left++ ;
    }
}

 
return l == Integer.MAX_VALUE ? 0 : l ;
    }
}