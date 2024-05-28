/**
 * 题目Id：106
 * 题目：从中序与后序遍历序列构造二叉树
 * 日期：2023-04-15 01:30:28
 */
//给定两个整数数组 inorder 和 postorder ，其中 inorder 是二叉树的中序遍历， postorder 是同一棵树的后序遍历，请你构造并
//返回这颗 二叉树 。 
//
// 
//
// 示例 1: 
// 
// 
//输入：inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
//输出：[3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//输入：inorder = [-1], postorder = [-1]
//输出：[-1]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= inorder.length <= 3000 
// postorder.length == inorder.length 
// -3000 <= inorder[i], postorder[i] <= 3000 
// inorder 和 postorder 都由 不同 的值组成 
// postorder 中每一个值都在 inorder 中 
// inorder 保证是树的中序遍历 
// postorder 保证是树的后序遍历 
// 
//
// Related Topics 树 数组 哈希表 分治 二叉树 👍 992 👎 0

package leetcode.editor.cn;

import java.util.HashMap;

//Java：从中序与后序遍历序列构造二叉树
public class P106_ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new P106_ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
        // TO TEST
        int[] inorder = {9, 3, 15, 20, 7}, postorder = {9, 15, 7, 20, 3};
        TreeNode root = solution.buildTree(inorder, postorder);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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
        int i;
        HashMap<Integer, Integer> map = new HashMap<>();

        //postorder左右出 出右左-逆序
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            int j = 0;
            for (int v : inorder) {
                map.put(v, j++);
            }
            i = postorder.length;
            return build(postorder, inorder, 0, inorder.length - 1);
        }

        public TreeNode build(int[] postorder, int[] inorder, int l, int r) {
            if (l > r) {
                return null;
            }
            int rootV = postorder[--i], rootI = map.get(rootV);
            TreeNode root = new TreeNode(rootV);
            root.right = build(postorder, inorder, rootI + 1, r);
            root.left = build(postorder, inorder, l, rootI - 1);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}