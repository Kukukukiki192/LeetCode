/**
 * 题目Id：剑指 Offer 07
 * 题目：重建二叉树
 * 日期：2023-04-15 02:44:28
 */
//输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。 
//
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
//
// 
//
// 示例 1: 
// 
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
//preorder-and-inorder-traversal/ 
//
// Related Topics 树 数组 哈希表 分治 二叉树 👍 1047 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

//Java：重建二叉树
public class POffer07_ZhongJianErChaShuLcof {
    public static void main(String[] args) {
        Solution solution = new POffer07_ZhongJianErChaShuLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        int[] preorder;
        int pRootI = 0;
        Map<Integer, Integer> vToI = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            this.preorder = preorder;
            int i = 0;
            for (int v : inorder) {
                vToI.put(v, i++);
            }
            return build(0, inorder.length - 1);
        }

        public TreeNode build(int l, int r) {
            if (l > r) return null;
            int rootV = preorder[pRootI++], rootI = vToI.get(rootV);
            TreeNode root = new TreeNode(rootV);
            root.left = build(l, rootI - 1);
            root.right = build(rootI + 1, r);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}