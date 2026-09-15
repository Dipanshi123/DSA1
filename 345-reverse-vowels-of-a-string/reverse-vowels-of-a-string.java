class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int st = 0;
        int e = s.length() - 1;
        String vowels = "aeiouAEIOU";
        while(st<e){
            while(st<e && vowels.indexOf(word[st])==-1){
                st++;
            }
            while(st<e && vowels.indexOf(word[e])==-1){
                e--;
            }
            char temp = word[st];
            word[st] = word[e];
            word[e] = temp;
            st++;
            e--;
        }
        String ans = new String(word);
        return ans;
        
    }
}