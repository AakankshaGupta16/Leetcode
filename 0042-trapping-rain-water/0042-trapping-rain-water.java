class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                leftMax = Math.max(leftMax, height[l]);
                water += leftMax - height[l]; // water trapped at current left
                l++;
            } else {
                rightMax = Math.max(rightMax, height[r]);
                water += rightMax - height[r]; // water trapped at current right
                r--;
            }
        }

        return water;
    }
}
