class Solution {
    public int lengthOfLongestSubstring(String s) {
       
     int[] freq = new int[256];
     int e = 0;
     int si = 0;
     int mxlen=0;
     while(e<s.length()){
        char ch = s.charAt(e);
        freq[ch]++;
        while(freq[ch]>1){
            char ch1 = s.charAt(si);
            freq[ch1]--;
            si++;
        }
        mxlen = Math.max(mxlen,e-si+1);
        e++;
     }
     return mxlen;
    }
}
        
    