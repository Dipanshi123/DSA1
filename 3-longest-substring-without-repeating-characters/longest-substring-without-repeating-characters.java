class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int e = 0;
        int si = 0;
        int mx_length = 0;
        while(e<s.length()){
            //grow..
            char ch =s.charAt(e);
            freq[ch]++;
            //shrink..
            while(freq[ch]>1){
                char ch1 = s.charAt(si);
      freq[ch1]--;
       si++;
            }
            //ans update
            mx_length = Math.max(mx_length,e-si+1);
            e++;

        }
        return mx_length;
        
    }
}