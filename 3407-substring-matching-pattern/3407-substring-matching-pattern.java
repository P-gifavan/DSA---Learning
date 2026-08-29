class Solution {
    public boolean hasMatch(String s, String p) {
        // Find the single asterisk position
        int starPos = p.indexOf('*');
        
        // Extract prefix and suffix strings around the asterisk
        String prefix = p.substring(0, starPos);
        String suffix = p.substring(starPos + 1);
        
        // Look for the first occurrence of the prefix
        int prefixIndex = s.indexOf(prefix);
        if (prefixIndex == -1) {
            return false;
        }
        
        // Find the suffix starting strictly after the matched prefix ends
        int suffixStartIndex = prefixIndex + prefix.length();
        int suffixIndex = s.indexOf(suffix, suffixStartIndex);
        
        return suffixIndex != -1;
    }
}
