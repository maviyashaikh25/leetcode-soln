import java.util.*;

class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        int res = 0;

        // Try all possible distinct counts
        for (int d = 1; d <= 26; d++) {
            Map<Character, Integer> freq = new HashMap<>();
            int left = 0, right = 0;
            int distinct = 0, countAtLeastK = 0;

            while (right < n) {
                char c = s.charAt(right);
                freq.put(c, freq.getOrDefault(c, 0) + 1);
                if (freq.get(c) == 1) distinct++;
                if (freq.get(c) == k) countAtLeastK++;
                right++;

                // Shrink if too many distinct chars
                while (distinct > d) {
                    char leftChar = s.charAt(left);
                    if (freq.get(leftChar) == k) countAtLeastK--;
                    freq.put(leftChar, freq.get(leftChar) - 1);
                    if (freq.get(leftChar) == 0) {
                        freq.remove(leftChar);
                        distinct--;
                    }
                    left++;
                }

                // Valid window: all distinct chars appear at least k times
                if (distinct == countAtLeastK) {
                    res = Math.max(res, right - left);
                }
            }
        }

        return res;
    }
}
