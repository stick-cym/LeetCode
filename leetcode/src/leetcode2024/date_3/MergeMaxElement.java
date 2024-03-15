package leetcode2024.date_3;

public class MergeMaxElement {
    public static void main(String[] args) {
        System.out.println(maxArrayValue1(new int[]{2,3,7,9,3}));
        System.out.println(maxArrayValue1(new int[]{5,3,3}));
        System.out.println(maxArrayValue1(new int[]{91,50}));
    }

    public static long maxArrayValue1(int[] nums) {
        int i=nums.length-2;
        long sum=nums[nums.length-1];
        while(i>=0){
            sum=nums[i]>sum? nums[i]:sum+nums[i];
            i--;
        }
        return sum;
    }

    /**
     * @param nums
     * @return
     * @deprecated 原因:当数组中nums[i]的元素大于整形最大值时将不再适用
     */
    public static long maxArrayValue(int[] nums) {
        int i= nums.length-1,j=i-1;
        long res=nums[i];
        while (i>-1 && j>-1){
            if(nums[j]>nums[i]){
                res=Math.max(Math.max(res,nums[i]),nums[j]);
                i=j;
                j--;
            }
            else {
                nums[i]+=nums[j];
                res=Math.max(res,nums[i]);
                j--;
            }
        }
        return res;
    }
}
