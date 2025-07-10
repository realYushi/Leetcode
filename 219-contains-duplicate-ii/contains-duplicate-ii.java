class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (set.contains(nums[r])) {
                return true;
            }
            set.add(nums[r]);
            if (r - l + 1 > k) {
                set.remove(nums[l]);
                l++;
            }
        }
        return false;
    }

}