class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        int res=0;
        int l=0;
        for(int r=0; r<s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            res=Math.max(res,r-l+1);
            set.add(s.charAt(r));
        }
        
        
        return res;

    }
}