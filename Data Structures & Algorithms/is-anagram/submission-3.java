class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(!hashMap.containsKey(c) || hashMap.get(c) == 0) {
                return false;
            }
            hashMap.put(c, hashMap.get(c) - 1);
        }
        return true;
    }
}
