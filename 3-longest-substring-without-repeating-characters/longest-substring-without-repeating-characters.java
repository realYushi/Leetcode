class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int l=0;
        int res=1;
        for(int r= 0; r<s.length();r++){
            char c= s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);

            res=Math.max(res,r-l+1);
        }
        return res;

        
    }
}