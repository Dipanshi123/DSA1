class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int se = 0;
        int e = ch.length - 1;
        String st = "aeiouAEIOU";
        while(se<e){
            while(se<e && st.indexOf(ch[se])==-1){
                se++;
            }
            while(se<e && st.indexOf(ch[e])==-1){
                e--;
            }
            char temp = ch[se];
            ch[se] = ch[e];
            ch[e] = temp;
            se++;
            e--;
        }
        String ans = new String(ch);
        return ans;
        
    }
}