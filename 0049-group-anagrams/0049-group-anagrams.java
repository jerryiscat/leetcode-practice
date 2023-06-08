class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create map to store each anagrams
        // key: anagrams; value: list of words
        Map<String, List<String>> result = new HashMap();

        // loop over the array
        for(int i = 0; i < strs.length; i++) {
            // create anagram
            char charArray[] = strs[i].toCharArray();
            Arrays.sort(charArray);
            String anagram = new String (charArray);
            if(!result.containsKey(anagram)) {
                result.put(anagram, new ArrayList<String>());
            } 
            result.get(anagram).add(strs[i]);
        }

        List<List<String>> resultList = new ArrayList<>();
        resultList.addAll(result.values());
        return resultList;
    }
}