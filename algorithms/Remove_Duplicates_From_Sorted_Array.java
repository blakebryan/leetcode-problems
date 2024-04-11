class Solution {
    public int removeDuplicates(int[] nums) {
        int curIndex = 0, curVal, j;

        if (nums.length == 0) {
            return 0;
        }

        curIndex = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (j = curIndex; j < nums.length && nums[j] == nums[i]; j++)
                ;
            if (j < nums.length) {
                nums[i + 1] = nums[j];
                curIndex = j + 1;
            } else {
                break;
            }
        }

        j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                j++;
            } else {
                break;
            }
        }

        return j;
    }
}