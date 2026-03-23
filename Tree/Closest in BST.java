/*

Given a BST and an integer. Find the least absolute difference between any node value of the BST and the given integer.

Example 1:

Input:
        10
      /   \
     2    11
   /  \ 
  1    5
      /  \
     3    6
      \
       4
K = 13
Output: 2
Explanation: K=13. The node that has value nearest to K is 11. so the answer is 2
Example 2:

Input:
      8
    /   \
   1     9
    \     \
     4    10
    /
   3
K = 9
Output: 0
Explanation: K=9. The node that has value nearest to K is 9. so the answer is 0.
Constraints:
1 <= Number of nodes <= 105
1 <= Value stored at nodes(data), K <= 105

/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Function to find the least absolute difference between any node
    // value of the BST and the given integer.
    
    static int minDiff(Node root, int K) {
        
        int minDiff = Integer.MAX_VALUE;
        while (root != null) {
            int diff = Math.abs(root.data - K);
            minDiff = Math.min(minDiff, diff);
            
            if (K < root.data) {
                root = root.left;
            } else if (K > root.data) {
                root = root.right;
            } else {
                return 0;
            }
        }
        
    //     return helper(root, K, Integer.MAX_VALUE);
    // }
    
    // static int helper(Node root, int k, int minDiff) {
    //     if (root == null) return minDiff;
    //     minDiff = Math.min(minDiff, Math.abs(root.data - k));
    //     minDiff = helper(root.left, k, minDiff);
    //     minDiff = helper(root.right, k, minDiff);
        return minDiff;
    }
}
