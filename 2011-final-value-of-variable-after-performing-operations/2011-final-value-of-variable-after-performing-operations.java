class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(int i=0;i<operations.length;i++) {
            String ch = operations[i];
            if( ch.equals("--X") || ch.equals("X--")) {
                result = result -1;
            }else{
                result = result +1;
            }
        }
        return result;
    }
}