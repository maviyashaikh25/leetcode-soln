class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int s = 0;
        int[] res ;

        while(l<r){
            s = numbers[l] + numbers[r];


if( s == target ){
    
   return new int[]{ l + 1 , r + 1} ; 
}

else if ( s < target ){

l+=1;
}else{

    r-=1 ;
}

        }

return new int[]{-1,-1};

        
    }
}