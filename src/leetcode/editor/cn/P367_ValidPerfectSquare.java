/**
 * 题目Id：367
 * 题目：有效的完全平方数
 * 日期：2021-11-12 20:32:20
 */
//给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。 
//
// 进阶：不要 使用任何内置的库函数，如 sqrt 。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 16
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：num = 14
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 2^31 - 1 
// 
// Related Topics 数学 二分查找 👍 318 👎 0

package leetcode.editor.cn;

//Java：有效的完全平方数
public class P367_ValidPerfectSquare {
    public static void main(String[] args) {
        Solution solution = new P367_ValidPerfectSquare().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //TC:O(logN)二分查找 SC:O(1)
        public boolean isPerfectSquare(int num) {
            int l = 0, r = num;
            long m;
            while (l <= r) {
                m = l + (r - l) / 2;
                if (m * m <= num) l = (int) m + 1;
                else r = (int) m - 1;
            }
            if (r * r == num) return true;
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}