class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // remainder 0 seen at index -1 (to handle subarrays starting at index 0)

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;

            // normalize remainder for negative values
            if (remainder < 0) remainder += k;

            if (map.containsKey(remainder)) {
                // ensure subarray length >= 2
                if (i - map.get(remainder) > 1) {
                    return true;
                }
            } else {
                // store earliest index for this remainder
                map.put(remainder, i);
            }
        }
        return false;
    }
}
