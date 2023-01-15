/*Given the root of a binary tree, return all root-to-leaf paths in any order.
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
A leaf is a node with no children.*/

import java.util.List;

class Solution {
    List<String> result;
    public List<String> binaryTreePaths(TreeNode root) {

    }

    public void binaryTreePaths(TreeNode node, String soFarValues) {
        // if it's a leaf, then it's a base case and I add my solution
        // keep going down 
        if (node.right == null && node.left == null) {
            // base case
            // add the value and return soFarValues
            nodeHelper(node, soFarValues);
            result.add(soFarValues);
        } else {
            nodeHelper(node, soFarValues);
            if (node.left != null) binaryTreePaths(node.left, soFarValues)
            if (node.right != null) binaryTreePaths(node.right, soFarValues)
        }
    }
    public void nodeHelper(TreeNode node, String soFarValues) {
        if (soFarValues.isEmpty()) {
            soFarValues = node.val;
        } else {
            soFarValues.concat("->" + node.val)
        }
    }