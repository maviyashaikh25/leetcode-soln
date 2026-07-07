import java.util.*;

class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<int[]> stack = new Stack<>();
        int curMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            
            while (!stack.isEmpty() && n >= stack.peek()[0]) {
                stack.pop();
            }
            
            if (!stack.isEmpty() && n < stack.peek()[0] && n > stack.peek()[1]) {
                return true;
            }
            
            stack.push(new int[]{n, curMin});
            
            curMin = Math.min(curMin, n);
        }
        return false;
    }
}
