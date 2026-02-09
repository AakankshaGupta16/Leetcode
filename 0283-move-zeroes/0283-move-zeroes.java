class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // Pointer for the position of next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] and nums[j] if i and j are different
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++; // Move the pointer for placing the next non-zero
            }
        }
    }
}
