package leetcode2024.date_2;

import java.util.Arrays;

public class MinStr {
    public static void main(String[] args) {
        String ss="AB.FC.AC..D.B";
        ss.concat("sad");
        String[] split = ss.split("\\.");
        for (String s : split) {
            System.out  .println(s);
        }
    }
}
