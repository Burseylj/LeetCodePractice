class Solution {
    public String longestPalindrome(String s) {
        String largest = "";
        
        
        
        
        //even
        for (int i = 0; i < s.length(); i++) {
            String newSub = "";
            for (int j = 0; i+j+1 < s.length() && i-j >= 0; j++) {
                if (s.charAt(i-j) == s.charAt(i+j+1)) {
                    newSub = s.substring(i-j, i + j +2);
                } else {
                    break;
                }
                if (newSub.length() > largest.length()) {
                    largest = newSub;
                }
            }
            
            
        }
        //odd
        for (int i = 0; i < s.length(); i++) {
            String newSub = "";
            for (int j = 0; i+j < s.length() && i-j >= 0; j++) {
                if (s.charAt(i-j) == s.charAt(i+j)) {
                    newSub = s.substring(i-j, i + j+1);
                } else {
                    break;
                }
                if (newSub.length() > largest.length()) {
                    largest = newSub;
                }
            }  
        }
        
        
        
        return largest;
    }
}