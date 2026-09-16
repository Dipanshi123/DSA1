class Solution {
    public void reverseString(char[] s) {
        int se = 0;
        int e = s.length-1;
        while(se<e){
            char temp = s[se];
            s[se] = s[e];
            s[e] = temp;
            se++;
            e--;
        }
        
    }
}