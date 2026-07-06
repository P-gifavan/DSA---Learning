class Solution {
    public int[] evenOddBit(int n) {
        String s =Integer.toBinaryString(n);
        int evenCount =0;
        int oddCount = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(s.length()-1-i)=='1') {
                if(i%2 == 0) {
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
        }
        return new int[] {evenCount,oddCount};
    }
}