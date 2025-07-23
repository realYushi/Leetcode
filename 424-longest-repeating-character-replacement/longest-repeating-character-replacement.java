class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> set= new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        int res=0;
        for(char c:set){
            int l=0;
            int counter=0;
            for(int r=0;r<s.length(); r++){
                if(s.charAt(r)==c){
                    counter++;
                }
                while(r-l+1-counter>k){
                    if(s.charAt(l)==c){
                        counter--;
                    }
                    l++;
                }
                res=Math.max(res,r-l+1);
            }
        }
        return res;
    }
}