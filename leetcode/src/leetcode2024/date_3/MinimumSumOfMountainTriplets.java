package leetcode2024.date_3;

public class MinimumSumOfMountainTriplets {
    public static void main(String[] args) {
        System.out.println(minimumSum(new int[]{5,4,8,7,10,2}));
    }


    public static int minimumSum(int[] nums) {
        Integer o =1;
        int sum=Integer.MAX_VALUE;
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i-1]<nums[i] &&nums[i+1]<nums[i]){
                sum=Math.min(nums[i-1]+nums[i]+nums[i+1],sum);
            }
        }
        if(sum==Integer.MAX_VALUE){
            return -1;
        }
        return sum;
    }
}
