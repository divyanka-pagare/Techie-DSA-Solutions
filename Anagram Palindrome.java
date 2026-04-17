class Solution {
    boolean canFormPalindrome(String s) {
        // int[] freq = new int[26];
        // for (char ch : s.toCharArray()) {
        //     freq[ch - 'a']++;
        // }
        // int oddCount = 0;
        
        // for (int count : freq) {
        //     if (count % 2 != 0) {
        //         oddCount++;
        //         if (oddCount > 1) return false;
        //     }
        // }
        // return true;
        
        int mask = 0;
        for (char ch : s.toCharArray()) {
            int bit = ch - 'a';
            mask ^= (1 << bit);
        }
        return (mask == 0) || ((mask & (mask - 1)) == 0);
    }
}
