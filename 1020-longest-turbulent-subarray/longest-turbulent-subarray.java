class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if (arr.length < 2) {
            return arr.length; // 0 for empty, 1 for single element
        }

        int maxLen = 1; // Minimum length of a turbulent subarray is 1
        int inc = 1;    // Length of current turbulent subarray ending with arr[i] where arr[i-1] < arr[i]
        int dec = 1;    // Length of current turbulent subarray ending with arr[i] where arr[i-1] > arr[i]

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) { // Current pair is increasing
                inc = dec + 1; // Extend the 'dec' sequence: previous was decreasing, now increasing
                dec = 1;       // Reset 'dec' as current pair is not decreasing
            } else if (arr[i] < arr[i-1]) { // Current pair is decreasing
                dec = inc + 1; // Extend the 'inc' sequence: previous was increasing, now decreasing
                inc = 1;       // Reset 'inc' as current pair is not increasing
            } else { // arr[i] == arr[i-1], turbulence breaks
                inc = 1; // Reset both counts
                dec = 1;
            }
            // Update maxLen with the longest of the two current sequences
            maxLen = Math.max(maxLen, Math.max(inc, dec));
        }

        return maxLen;
    }
}