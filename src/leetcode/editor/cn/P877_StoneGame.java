//Alice 和 Bob 用几堆石子在做游戏。一共有偶数堆石子，排成一行；每堆都有 正 整数颗石子，数目为 piles[i] 。 
//
// 游戏以谁手中的石子最多来决出胜负。石子的 总数 是 奇数 ，所以没有平局。 
//
// Alice 和 Bob 轮流进行，Alice 先开始 。 每回合，玩家从行的 开始 或 结束 处取走整堆石头。 这种情况一直持续到没有更多的石子堆为止，此
//时手中 石子最多 的玩家 获胜 。 
//
// 假设 Alice 和 Bob 都发挥出最佳水平，当 Alice 赢得比赛时返回 true ，当 Bob 赢得比赛时返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：piles = [5,3,4,5]
//输出：true
//解释：
//Alice 先开始，只能拿前 5 颗或后 5 颗石子 。
//假设他取了前 5 颗，这一行就变成了 [3,4,5] 。
//如果 Bob 拿走前 3 颗，那么剩下的是 [4,5]，Alice 拿走后 5 颗赢得 10 分。
//如果 Bob 拿走后 5 颗，那么剩下的是 [3,4]，Alice 拿走后 4 颗赢得 9 分。
//这表明，取前 5 颗石子对 Alice 来说是一个胜利的举动，所以返回 true 。
// 
//
// 示例 2： 
//
// 
//输入：piles = [3,7,2,3]
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 2 <= piles.length <= 500 
// piles.length 是 偶数 
// 1 <= piles[i] <= 500 
// sum(piles[i]) 是 奇数 
// 
//
// Related Topics数组 | 数学 | 动态规划 | 博弈 
//
// 👍 505, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//

package leetcode.editor.cn;
//Java：石子游戏
public class P877_StoneGame{
    public static void main(String[] args) {
        Solution solution = new P877_StoneGame().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean stoneGame(int[] piles) {
        /*偶数堆奇数个石子->先手胜
        * eg. 3 5/ 3 4/ 2 3/ 7 2/ 5 3/  奇数堆20个 偶数堆/17个 -> 先拿左3胜(控制对方拿偶数堆) */
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}