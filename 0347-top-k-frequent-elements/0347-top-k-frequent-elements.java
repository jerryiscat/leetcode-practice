import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create HashMap
        // k: num
        // v: count
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numsMap.containsKey(nums[i])) {
                numsMap.put(nums[i], 0);
            }
            numsMap.put(nums[i], numsMap.get(nums[i]) + 1);
        }
        
        // Sort the map by value
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(numsMap.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue());
        
        // Get the first k elements
        List<Integer> topK = new ArrayList<>();
        for (int i = sortedEntries.size() - 1; i >= 0 && k > 0; i--, k--) {
            topK.add(sortedEntries.get(i).getKey());
        }
        
        // Convert the list to an array
        int[] result = new int[topK.size()];
        for (int i = 0; i < topK.size(); i++) {
            result[i] = topK.get(i);
        }
        
        return result;
    }
}
