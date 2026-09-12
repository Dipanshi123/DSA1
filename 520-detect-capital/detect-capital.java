class Solution {
    public boolean detectCapitalUse(String word) {
        int c = 0;
        int n = word.length();
        for(int i = 0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                c++;
            }
        }
        if(c==n) return true;
        if(c==0) return true;
        if(c==1 && (word.charAt(0)>='A' && word.charAt(0)<='Z')) return true;
        else return false;
    }
}