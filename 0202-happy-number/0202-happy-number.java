class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        while(n > 9) {
            while(n>0) {
                int digit = n %10;
                sum = sum + digit *digit;
                n = n/10;
            }
            n = sum;
            sum = 0;
        }
       return n==1 || n==7;
    }
}