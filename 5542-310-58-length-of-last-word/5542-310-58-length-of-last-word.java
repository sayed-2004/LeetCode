class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        Boolean wordStarted = false;

        for(int i = s.length() - 1; i >= 0; i--){
            char letter  = s.charAt(i);
            if(letter == ' ' && !wordStarted){
                continue;
            }
            if(letter != ' '){
                wordStarted = true;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}