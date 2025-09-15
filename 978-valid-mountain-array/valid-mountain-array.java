class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false; // must have at least 3 elements

        int i = 0;

        // climb up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // peak can't be first or last
        if (i == 0 || i == n - 1) return false;

        // climb down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // check if reached the end
        return i == n - 1;
    }
}
