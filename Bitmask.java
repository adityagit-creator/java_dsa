class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;
        int bitmask = 0;
        for (char c : s.toCharArray()) {
            bitmask ^= (1 << (c - 'a'));
        }
        int oddCount = Integer.bitCount(bitmask);
        return oddCount <= k;
    }
}
// Bitmasking
// Explanation
// Each character corresponds to a specific bit in a bitmask (e.g., 'a' is the 0th bit, 'b' is the 1st bit, etc.).
// Toggle the bits for each character in the string:
// If a bit is 1, it indicates an odd frequency.
// If a bit is 0, it indicates an even frequency.
// Count the number of 1s in the bitmask to determine how many characters have odd frequencies.
// If the number of odd frequencies is ≤ k, constructing k palindromes is possible.
// 💻Complexity
// Time Complexity:
// O(n) — Iterate through the string and count set bits.
// Space Complexity:
// O(1) — Constant space used for the bitmask.
