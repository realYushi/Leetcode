class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int res=0;
        Set<Character> set= new HashSet<>();
        for(char c:s.toCharArray()){

            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            res=Math.max(res,r-l+1);
            r++;
            
        }
        
        return res;
    }
}