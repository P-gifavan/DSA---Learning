class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            words[i]= sb.reverse().toString();
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            if(i!=words.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}