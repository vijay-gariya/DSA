class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        
        if(l1>l2 ){
            return false;
        }
        int i =0;
        int j=0;
        while(i<l1 && j<l2){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == l1;

    }
}