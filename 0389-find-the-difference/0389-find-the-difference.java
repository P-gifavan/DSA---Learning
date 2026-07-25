class Solution {
    public char findTheDifference(String s, String t) {
        char[] s1 =s.toCharArray();
        char[] t1=t.toCharArray();
        int result=0;
        for(char c:s1) {
            result=result^c;
        }
        for(char c:t1) {
            result = result^c;
        }
        return (char)result;


    }
}