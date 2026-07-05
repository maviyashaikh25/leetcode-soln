class Solution {
    public int longestPalindrome(String s) {


         Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }



        int length = 0;
        boolean hasOdd = false;


        for( int count : freq.values()){

 if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1; // use the even part
                hasOdd = true;
            }
        }

        if (hasOdd) length += 1; // one odd can sit in the center

        return length;
    }
}