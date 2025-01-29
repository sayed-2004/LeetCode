class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romInt = new HashMap<>();
        romInt.put('I', 1);
        romInt.put('V', 5);
        romInt.put('X', 10);
        romInt.put('L', 50);
        romInt.put('C', 100);
        romInt.put('D', 500);
        romInt.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romInt.get(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    
    }
}