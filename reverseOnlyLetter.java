class Solution {
    public String reverseOnlyLetters(String s) {
        //swapnill
        // basicaly in this problem we have to use two pointer approach i and j
        int i = 0;
        int j = s.length()-1;
        //convert strig to character array
        char[] arr = s.toCharArray();
        while(i<j){
            if(isEnglish(arr[i])){
                //while the j'th character is notEnglish word than 
                while(!isEnglish(arr[j])){
                    j--;
                }
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            i++;
        }
        return new String(arr);
    }
    public boolean isEnglish(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z');
    }

    
}
