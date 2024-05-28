/**
  * 题目Id：104
  * 题目：二叉树的最大深度
  * 日期：2022-12-02 15:51:36
*/
//给定一个二叉树，找出其最大深度。 
//
// 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例： 给定二叉树 [3,9,20,null,null,15,7]， 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最大深度 3 。 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 1438 👎 0

package leetcode.editor.cn;
//Java：二叉树的最大深度
public class P104_MaximumDepthOfBinaryTree{
    public static void main(String[] args) {
        Solution solution = new P104_MaximumDepthOfBinaryTree().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.*/
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    //TC:O(n) SC:(1) 分解问题:计算左右子树最大深度取最大值+根节点
    public int maxDepth(TreeNode root) {
        if(root==null) { return 0; }
        int dl=maxDepth(root.left);
        int dr=maxDepth(root.right);
        int d=Math.max(dl,dr)+1;
        return d;
    }

    //TC:O(n) SC:(1) 遍历二叉树:外部变量记录每个叶子节点深度->取最大值
//    int d=0, ans=0;
//    public int maxDepth(TreeNode root) {
//        traverse(root);
//        return ans;
//    }
//
//    public void traverse(TreeNode root) {
//        if(root==null) { return; }
//        //前序位置
//        d++;
//        if(root.left==null && root.right==null) {
//            ans = Math.max(ans, d); //到达叶子节点更新
//        }
//        traverse(root.left);
//        //中序位置:代码在节点左子树都遍历完,将遍历右子树时执行
//        traverse(root.right);
//        //后序位置
//        d--;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}