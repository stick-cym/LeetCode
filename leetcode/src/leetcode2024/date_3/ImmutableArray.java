package leetcode2024.date_3;

public class ImmutableArray {
    //进阶解法
    private int[] sums;
    public ImmutableArray(int[] nums,int a) {
        sums=new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            sums[i+1]+=sums[i]+nums[i];
        }
    }

    public int sumRange1(int left, int right) {
        return sums[right+1]-sums[left];
    }
    private int[] nums;

    //基本解法
    public ImmutableArray(int[] nums) {
        this.nums=nums;
    }

    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        ImmutableArray immutableArray=new ImmutableArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(immutableArray.sumRange(0,2));
        System.out.println(immutableArray.sumRange(2,5));
        System.out.println(immutableArray.sumRange(0,5));
        ImmutableArray immutableArray1=new ImmutableArray(new int[]{-2, 0, 3, -5, 2, -1},1);
        System.out.println(immutableArray1.sumRange1(0,2));
        System.out.println(immutableArray1.sumRange1(2,5));
        System.out.println(immutableArray1.sumRange1(0,5));
    }
}
