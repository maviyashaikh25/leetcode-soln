class Solution {
    public int[] sortedSquares(int[] nums) {
        

int i = 0;
int j = nums.length - 1;
int[] r =new int[nums.length];
int k =  nums.length - 1;


while(i<=j){


if(Math.abs(nums[i])>Math.abs(nums[j])){

r[k]= nums[i] * nums[i] ;
i++ ;
k-- ;
}else{

r[k]= nums[j] * nums[j] ;
j--;
k-- ;

}

}


return r ;

    }
}