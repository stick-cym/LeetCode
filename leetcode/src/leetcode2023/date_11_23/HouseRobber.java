package leetcode2023.date_11_23;

import java.util.Arrays;

/**
 * @author 86176
 * @date 2023/11/23
 * @description 小偷偷钱问题(动态规划)
 */
public class HouseRobber {
    public static void main(String[] args) {
        int []num={1,2,3,1},num1={2,7,9,3,1};
        int[] ints = rob2(num, num1);
        Arrays.stream(ints).forEach(System.out::println);
    }

    /**
     * @param nums
     * @return {@link int[]}
     */
    public static int[] rob2(int[] ...nums) {
        int[] res=new int[nums.length];
        int i=0;
        for (int[] num : nums) {
            int pre=0,cur=0;
            for (int n : num) {
                int temp = Math.max(cur, pre + n);
                pre = cur;
                cur = temp;
            }
            res[i++]=cur;
        }
        return res;
    }

    /**
     * @param nums
     * @return int
     */
    public static int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] dp =new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<=nums.length;i++){
            dp[i]=Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        }
        return dp[nums.length];
    }
}
