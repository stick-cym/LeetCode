package leetcode2023.date_11_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LessThanTargetNumbers {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(new Integer[]{-5,0,-7,-1,9,8,-9,9}));
        System.out.println(countPairs(list, 2));
    }
    public static int countPairs(List<Integer> nums, int target) {
        int res=0;
        nums.sort(Comparator.comparingInt((Integer a) -> a));
        nums.get(0);
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(j)+nums.get(i)<target){
                    res++;
                }
            }
        }
        return res;
    }
}
