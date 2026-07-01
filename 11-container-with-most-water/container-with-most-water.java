import java.util.* ;
class Solution {
    public int maxArea(int[] height) {
int l = 0 ;
int r = height.length - 1 ;

int mw= Integer.MIN_VALUE ;


while(l<r){

int w = r-l ;
int h = Math.min(height[l] , height[r]);
int t = h*w ;

mw = Math.max(mw,t);


if(height[l] < height[r]){
    l++ ;
}else{
    r-- ;
}


}

return mw ;
        
    }
}