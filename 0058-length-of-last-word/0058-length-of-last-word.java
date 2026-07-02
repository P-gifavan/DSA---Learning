class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] array = s.split(" ");
        int n = array.length;
        String str = array[n-1];

        return str.length();
    }
}