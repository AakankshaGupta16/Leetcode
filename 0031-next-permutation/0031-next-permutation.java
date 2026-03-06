class Solution {
    public void nextPermutation(int[] arr) {

        int n = arr.length;
        int ind = -1;

        // Step 1: find breakpoint
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                ind = i;
                break;
            }
        }

        // Step 2: if no breakpoint
        if(ind == -1) {
            reverse(arr, 0, n-1);
            return;
        }

        // Step 3: find next greater
        for(int i = n-1; i > ind; i--) {
            if(arr[i] > arr[ind]) {
                swap(arr, i, ind);
                break;
            }
        }

        // Step 4: reverse right part
        reverse(arr, ind+1, n-1);
    }

    public void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public void reverse(int[] arr, int l, int r) {
        while(l < r) {
            swap(arr, l, r);
            l++;
            r--;
        }
    }
}