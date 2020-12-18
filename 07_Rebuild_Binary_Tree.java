/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, n - 1, inorder, 0, n - 1, indexMap);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int preorderStart, int preorderEnd,
        int[] inorder, int inorderStart, int inorderEnd, HashMap<Integer,Integer> indexMap) {
        if (preorderStart > preorderEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preorderStart]);
        if (preorderStart == preorderEnd) {
            return root;
        }
        int rootId = indexMap.get(root.val);
        int leftNodes = rootId - inorderStart;
        int rightNodes = inorderEnd - rootId;
        TreeNode leftTree = buildTree(preorder, preorderStart + 1, preorderStart  + leftNodes, inorder, inorderStart, rootId - 1, indexMap);
        TreeNode rightTree = buildTree(preorder, preorderEnd - rightNodes + 1, preorderEnd, inorder, rootId + 1, inorderEnd, indexMap);
        root.left = leftTree;
        root.right = rightTree;
        return root;
    }
}