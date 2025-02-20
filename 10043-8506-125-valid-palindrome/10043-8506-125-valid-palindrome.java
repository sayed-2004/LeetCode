class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start < end){

            // Skip non-alphanumeric characters from the start
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            // Skip non-alphanumeric characters from the end
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}