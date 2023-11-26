package leetcode2023.date_11_26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] n={1,2};
        System.out.println(Arrays.stream(new int[]{1, 2}).max().getAsInt());
        List<Integer> collect = Arrays.stream(n).boxed().collect(Collectors.toList());
        System.out.println(collect.indexOf(Arrays.stream(new int[]{1, 2}).max().getAsInt()));
        System.out.println(findPeakElement(n));
    }

    public static int findPeakElement(int[] nums) {
        return Arrays.stream(nums)
                .boxed().collect(Collectors.toList())
                .indexOf(Arrays.stream(nums).max().getAsInt());
    }
}
