/**
 * 题目Id：509
 * 题目：斐波那契数
 * 日期：2022-01-27 09:39:40
 */
//斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是： 
//
// 
//F(0) = 0，F(1) = 1
//F(n) = F(n - 1) + F(n - 2)，其中 n > 1
// 
//
// 给定 n ，请计算 F(n) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 2
//输出：1
//解释：F(2) = F(1) + F(0) = 1 + 0 = 1
// 
//
// 示例 2： 
//
// 
//输入：n = 3
//输出：2
//解释：F(3) = F(2) + F(1) = 1 + 1 = 2
// 
//
// 示例 3： 
//
// 
//输入：n = 4
//输出：3
//解释：F(4) = F(3) + F(2) = 2 + 1 = 3
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 30 
// 
// Related Topics 递归 记忆化搜索 数学 动态规划 👍 390 👎 0

package leetcode.editor.cn;

import java.util.Scanner;

//Java：斐波那契数
public class P509_FibonacciNumber {
    public static void main(String[] args) {
        Solution solution = new P509_FibonacciNumber().new Solution();
        // TO TEST
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution.fib(n));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 递归
         * TC = 递归次数(递归树节点个数) * 每次递归的TC = O(2^N)
         * SC = 递归深度 * 每次递归的SC = O(N)
         * 题目有时间限制会TimeOut->答案需要取模1e9+7(1000000007),如计算初始结果为:1000000008,请返回1
         * @param n
         * @return
         */
        public int fib(int n) {
            if (n < 2) return n;
            return (fib(n - 1) + fib(n - 2)) % 1000000007; //每次递归的TC=O(1)
        }

        //TC:O(N) SC:O(N) 动态规划-dp数组
        public int fib(int n) {
            if (n < 2) return n;
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
            }
            return dp[n];
        }

        // TC:O(N) SC:O(1) 动态规划-dp数组优化
        public int fib(int n) {
            if (n < 2) return n;
            int a = 0, b = 1, c = 0; //Java c=0要先初始化后面才能赋值
            for (int i = 2; i <= n; i++) {
                c = (a + b) % 1000000007;
                a = b;
                b = c;
            }
            return c;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}