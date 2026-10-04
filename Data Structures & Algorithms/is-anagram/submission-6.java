class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char letter : s.toCharArray()){
            map1.put(letter, map1.getOrDefault(letter, 0) + 1);
        }
        for(char letter : t.toCharArray()){
            map2.put(letter, map2.getOrDefault(letter, 0) + 1);
        }
        // for(int i = 0; i < s.length(); i++){
        // }
        return map1.equals(map2);
    }
}
