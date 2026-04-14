845. Longest Mountain in Array




class Solution {
public:
    int longestMountain(vector<int>& arr) {
        int n = arr.size();
        int maxLen = 0;

        for (int i = 1; i < n - 1; i++) {
            // Check if arr[i] is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                
                int left = i;
                int right = i;

                // Move left (increasing part)
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // Move right (decreasing part)
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                int length = right - left + 1;
                maxLen = max(maxLen, length);
            }
        }

        return maxLen;
    }
};
