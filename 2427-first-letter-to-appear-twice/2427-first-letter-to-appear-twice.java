class Solution {
    public char repeatedCharacter(String s) {
        for (int i = 0; i < s.length(); i++ ) {
            String subString = s.substring(0, i);
            if (subString.contains(String.valueOf(s.charAt(i)))) {
                return s.charAt(i);
            }
        }
        return 'a';
    }
}