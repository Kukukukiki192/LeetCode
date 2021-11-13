/**
 * 题目Id：35
 * 题目：搜索插入位置
 * 日期：2021-11-12 20:30:54
 */
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 请必须使用时间复杂度为 O(log n) 的算法。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,3,5,6], target = 5
//输出: 2
// 
//
// 示例 2: 
//
// 
//输入: nums = [1,3,5,6], target = 2
//输出: 1
// 
//
// 示例 3: 
//
// 
//输入: nums = [1,3,5,6], target = 7
//输出: 4
// 
//
// 示例 4: 
//
// 
//输入: nums = [1,3,5,6], target = 0
//输出: 0
// 
//
// 示例 5: 
//
// 
//输入: nums = [1], target = 0
//输出: 0
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 为无重复元素的升序排列数组 
// -10⁴ <= target <= 10⁴ 
// 
// Related Topics 数组 二分查找 👍 1166 👎 0

package leetcode.editor.cn;

//Java：搜索插入位置
public class P35_SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new P35_SearchInsertPosition().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //TC:O(logN)二分查找 SC:O(1)
        public int searchInsert(int[] nums, int target) {
            int l = 0, r = nums.length - 1;
            if (target <= nums[0]) return 0;
            if (target > nums[r]) return r + 1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (target < nums[m]) r = m - 1;
                else if (target > nums[m]) l = m + 1;
                else return m;
            }
            return r + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}