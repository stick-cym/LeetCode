package leetcode2023.date_12;

import java.util.Arrays;
import java.util.Comparator;

public class MaxProfitOfTaxi {
    public static void main(String[] args) {
        int[][] rides={{2,5,4},{1,5,1},{6,5,1},{3,5,1}};
        Arrays.sort(rides, Comparator.comparingInt(o -> o[0]));
        Arrays.stream(rides).forEach(ints -> System.out.println(ints[0]));
        Integer i=1;
        System.out.println(i==1);
    }
}
