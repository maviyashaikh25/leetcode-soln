class Solution {
    public boolean isAnagram(String s, String t) {
        

        Map<Character,Integer> m= new HashMap<>() ;

        for(int i =0 ; i < s.length() ; i++ ){
char c = s.charAt(i);
m.put(c, m.getOrDefault( c , 0)+1) ;
 

        }

        
        for(int i =0 ; i < t.length() ; i++ ){
char c = t.charAt(i);

if(!m.containsKey(c)) return false ;

m.put(c, m.get(c) - 1);
if(m.get(c) == 0){
    m.remove(c) ;
}

        }

        return m.isEmpty();
    }
}