class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        if(s.length() != t.length())
            return false;

        for(int i = 0; i < s.length(); i++) {
            if(hashMap1.containsKey(s.charAt(i))){
                hashMap1.put(s.charAt(i), hashMap1.get(s.charAt(i)) + 1);
            }
            else {
                hashMap1.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            if(hashMap2.containsKey(t.charAt(i))){
                hashMap2.put(t.charAt(i), hashMap2.get(t.charAt(i)) + 1);
            }

            else {
                hashMap2.put(t.charAt(i), 1);
            }
        }

        for(int i = 0; i < s.length(); i++) {
            if(hashMap1.equals(hashMap2)){
                return true;
            }
        }
        return false;
    }
}
