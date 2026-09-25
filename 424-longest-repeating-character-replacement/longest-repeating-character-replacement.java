class Solution {
    public int characterReplacement(String s, int k) {
 int r = 0;
 int l = 0;
 int maxf = 0;
 int max = 0;
 int[] freq = new int[26];
 while(r<s.length()){
    freq[s.charAt(r) - 'A']++;
    maxf = Math.max(maxf,freq[s.charAt(r)-'A']);
    if((r-l+1)-maxf>k){
        freq[s.charAt(l)-'A']--;
        l++;
    }
        max = Math.max(max,(r-l+1));
        r++;
    
 }
 return max;
    }
}
 