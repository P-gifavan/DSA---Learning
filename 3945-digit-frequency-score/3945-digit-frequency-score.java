import java.util.HashMap;
import java.util.Map;
class Solution {
    int result=0;
    public int digitFrequencyScore(int n) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s = Integer.toString(n);
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()) {
            result = result + Integer.parseInt(String.valueOf(entry.getKey())) * entry.getValue() ;
        }
        return result;

    }
}