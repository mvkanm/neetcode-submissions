class Solution {
    public boolean isAnagram(String s, String t) {
        // Check if lengths are same
        if (s.length() != t.length()) return false;
        // Turn string into array of characters
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        // Sort array of characters
        Arrays.sort(charS);
        Arrays.sort(charT);
        // Turn character arrays into string again 
        String sortedS = String.valueOf(charS);
        String sortedT = String.valueOf(charT);    
        if(sortedS.equals(sortedT)) return true;
        else return false;    
    }
}
