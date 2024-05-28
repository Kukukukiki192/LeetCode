/**
 * 题目Id：105
 * 题目：从前序与中序遍历序列构造二叉树
 * 日期：2023-04-15 00:36:56
 */
//给定两个整数数组 preorder 和 inorder ，其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历，请构造二叉树并
//返回其根节点。 
//
// 
//
// 示例 1: 
// 
// 
//输入: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//输出: [3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//输入: preorder = [-1], inorder = [-1]
//输出: [-1]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= preorder.length <= 3000 
// inorder.length == preorder.length 
// -3000 <= preorder[i], inorder[i] <= 3000 
// preorder 和 inorder 均 无重复 元素 
// inorder 均出现在 preorder 
// preorder 保证 为二叉树的前序遍历序列 
// inorder 保证 为二叉树的中序遍历序列 
// 
//
// Related Topics 树 数组 哈希表 分治 二叉树 👍 1935 👎 0

package leetcode.editor.cn;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;

//Java：从前序与中序遍历序列构造二叉树
public class P105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        Solution solution = new P105_ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        int i = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int j = 0;
            for (int v : inorder) {
                map.put(v, j++);
            }
            return build(preorder, inorder, 0, inorder.length - 1);
        }

        public TreeNode build(int[] preorder, int[] inorder, int l, int r) {
            if (l > r) {
                return null;
            }
            int rootV = preorder[i++], rootI = map.get(rootV);
            TreeNode root = new TreeNode(rootV);
            root.left = build(preorder, inorder, l, rootI - 1);
            root.right = build(preorder, inorder, rootI + 1, r);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}