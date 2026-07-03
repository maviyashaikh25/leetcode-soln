class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        int c = 0;
        int sum =0;
m.put(0,1);
        for( int i =0 ; i < nums.length ; i++){

sum+=nums[i];
int mod = sum % k ;
if (mod < 0) mod += k;
if(m.containsKey(mod)){

    c+=m.getOrDefault(mod, 0);;
}
            m.put(mod, m.getOrDefault(mod, 0) + 1);
            
        }
       return c ; 
    }
}