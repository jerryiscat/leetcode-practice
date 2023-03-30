class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // if the set contain that num, that num appear for a second time
            if (uniques.contains(nums[i])) {
                return true;
            }
            // add the num at first time
            uniques.add(nums[i]);
        }
        return false;
    }
}