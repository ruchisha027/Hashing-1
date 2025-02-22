// Time Complexity :  O(1)
// Space Complexity : O(1) as we are dealing 26 characters only 
// Did this code successfully run on Leetcode : yes
// maintaining s to t mapping in sMap & t to s mapping in tMap 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
            }
            else{
                if(sMap.get(sChar)!=tChar) return false;
            }

             if(!tMap.containsKey(tChar)){
                tMap.put(tChar,sChar);
            }
            else{
                if(tMap.get(tChar)!=sChar) return false;
            }
            
        }
         return true;
    }
       
}