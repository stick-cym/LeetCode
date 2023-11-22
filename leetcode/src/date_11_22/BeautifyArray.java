package date_11_22;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*给你一个下标从 0 开始的整数数组 nums ，如果满足下述条件，则认为数组 nums 是一个 美丽数组 ：
        nums.length 为偶数
        对所有满足 i % 2 == 0 的下标 i ，nums[i] != nums[i + 1] 均成立
        注意，空数组同样认为是美丽数组。
        你可以从 nums 中删除任意数量的元素。当你删除一个元素时，被删除元素右侧的所有元素将会向左移动一个单位以填补空缺，而左侧的元素将会保持不变 。
        返回使 nums 变为美丽数组所需删除的 最少元素数目。*/
public class BeautifyArray {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,5};
        System.out.println(minDeletion(nums));
    }

    public static int minDeletion(int[] nums) {
        int n= nums.length;
        int ans=0;
        boolean check=true;
        for (int i = 0; i + 1 < n; i++) {
            if(nums[i]==nums[i+1] && check){
                ans++;
            }else{
                check=!check;
            }
        }
        if((n-ans)%2!=0){
            ans++;
        }
        return ans;
    }
}
