package leetcode.editor.cn;
//Java：长度最小的子数组
//题目标记:minimum-size-subarray-sum
//题目编号：209
//题目描述：//给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回
// 0。 
//
// 
//
// 示例： 
//
// 输入：s = 7, nums = [2,3,1,2,4,3]
//输出：2
//解释：子数组 [4,3] 是该条件下的长度最小的子数组。
// 
//
// 
//
// 进阶： 
//
// 
// 如果你已经完成了 O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。 
// 
// Related Topics 数组 双指针 二分查找 
// 👍 475 👎 0

public class P209MinimumSizeSubarraySum {
    public static void main(String[] args) {
//        int s = 11;
//        int[] nums = {1,2,3,4,5};

        int s = 7;
        int[] nums = {2,3,1,2,4,3};
        Solution solution = new P209MinimumSizeSubarraySum().new Solution();
        System.out.println(solution.minSubArrayLen(s,nums));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //自己写的
        public int minSubArrayLen(int s, int[] nums) {
            int l = 0, r = 1;
            int len = nums.length;
            if (nums.length == 0) {
                return len;
            }
            int temp = nums[0];
            boolean f = false;
            while (r <= nums.length && l < r) {
                if (temp >= s) {
                    f = true;
                    len = Math.min(len,r-l);
                    temp = temp - nums[l];
                    l++;

                }else{
                    if(r == nums.length){
                        break;
                    }
                    temp = temp + nums[r];
                    r++;

                }

            }
            if(!f){
                return 0;
            }
            return len;

        }
        //别人写的
        public int minSubArrayLen2(int s, int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }
            int ans = Integer.MAX_VALUE;
            int start = 0, end = 0;
            int sum = 0;
            while (end < n) {
                sum += nums[end];
                while (sum >= s) {
                    ans = Math.min(ans, end - start + 1);
                    sum -= nums[start];
                    start++;
                }
                end++;
            }
            return ans == Integer.MAX_VALUE ? 0 : ans;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)
}


