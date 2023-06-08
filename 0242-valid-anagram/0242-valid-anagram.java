class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        List stringA = new ArrayList();
        List stringB = new ArrayList();

        for(int i = 0; i < s.length(); i++) {
            stringA.add(s.charAt(i));
            stringB.add(t.charAt(i));
        }
        Collections.sort(stringA);
        Collections.sort(stringB);
        if(stringA.equals(stringB)) {
            return true;
        } else {
            return false;
        }
    }
}