// Expected Complexities
// Time Complexity: O(log n)
// Auxiliary Space: O(1)

// Company Tags
// Microsoft, Samsung, Adobe, Wipro, Brocade, Juniper Networks, Cisco, Qualcomm

// Topic Tags
// Bit Magic, Data Structures


class Solution {
    static int setBits(int n) {
        int count = 0;
        
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        
        return count;
    }
}

// Complexity

// Time: O(number of set bits) ≤ O(log n)

// Space: O(1)


