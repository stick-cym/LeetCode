package leetcode2024.date_3;

import java.util.Arrays;

//a×10+b：(a×10+b)mod m=(a mod m×10+b)mod
public class FindTheDivisibilityArrayOfString {
    public static void main(String[] args) {
        String word="1010";
        int[] div=new int[word.length()];
        int cur=0;
        for (int i = 0; i < word.length(); i++) {
            char c=word.charAt(i);
            cur=(cur*10+(c-'0'))%10;
            div[i]= cur==0? 1:0;
        }
        Arrays.stream(div).forEach(System.out::print);
    }
}
