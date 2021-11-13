/**
 * 题目Id：34
 * 题目：在排序数组中查找元素的第一个和最后一个位置
 * 日期：2021-11-12 17:24:10
 */
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。 
//
// 如果数组中不存在目标值 target，返回 [-1, -1]。 
//
// 进阶： 
//
// 
// 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？ 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4] 
//
// 示例 2： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1] 
//
// 示例 3： 
//
// 
//输入：nums = [], target = 0
//输出：[-1,-1] 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums 是一个非递减数组 
// -10⁹ <= target <= 10⁹ 
// 
// Related Topics 数组 二分查找 👍 1291 👎 0

package leetcode.editor.cn;

import java.util.Arrays;

//Java：在排序数组中查找元素的第一个和最后一个位置
public class P34_FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Solution solution = new P34_FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        // TO TEST
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] ans = solution.searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //TC:O(logN)二分查找 SC:O(1)
        int binarySearch(int[] nums, int target, boolean flag) {
            //border标志边界位置(不包含target),不设为-1是因为当target==nums[0]时,左边界为-1
            int l = 0, r = nums.length - 1, border = -2;
            if (r == -1 || target < nums[0] || target > nums[r]) return border; //数组为空/超范围
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (flag) { //寻找左边界
                    if (target <= nums[m]) {
                        r = m - 1;
                        border = r;
                    } else l = m + 1;
                } else { //寻找右边界
                    if (target >= nums[m]) {
                        l = m + 1;
                        border = l;
                    } else r = m - 1;
                }
            }
            return border;
        }

        public int[] searchRange(int[] nums, int target) {
            int leftBorder = binarySearch(nums, target, true);
            int rightBorder = binarySearch(nums, target, false);
            if (leftBorder == -2 || rightBorder == -2) return new int[]{-1, -1};
            if (rightBorder - leftBorder > 1) return new int[]{leftBorder + 1, rightBorder - 1};
            return new int[]{-1, -1};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}