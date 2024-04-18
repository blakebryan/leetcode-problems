class Solution {
    public int[] searchRange(int[] nums, int target) {
        int min = 0, max = nums.length - 1;
        int[] result = {-1, -1};

        while (min <= max) {
            int mid = (min + max) / 2;

            if (nums[mid] == target && (mid == 0 || nums[mid - 1] != target)) {
                result[0] = mid;
                break;
            } else if (nums[mid] >= target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        min = 0;
        max = nums.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;

            if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] != target)) {
                result[1] = mid;
                break;
            } else if (nums[mid] > target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return result;
    }
}