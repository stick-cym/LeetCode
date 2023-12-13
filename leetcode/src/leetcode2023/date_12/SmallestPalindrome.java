package leetcode2023.date_12;

public class SmallestPalindrome {

    public static void main(String[] args) {

    }

    //Method1:use char[]
    public static String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                arr[left] = arr[right] = (char) Math.min(arr[left], arr[right]);
            }
            ++left;
            --right;
        }
        return new String(arr);
    }

    //Method2:use StringBuffer
    public static String makeSmallestPalindrome2(String s) {
        StringBuffer buff=new StringBuffer(s);
        int i=0,j=s.length()-1;
        while(i<j){
            char left=buff.charAt(i),right=buff.charAt(j);
            if(left!=right){
                if(left>right){
                    buff.replace(i,i+1,String.valueOf(right));
                }else{
                    buff.replace(j,j+1,String.valueOf(left));
                }
            }
            i++;
            j--;
        }
        return buff.toString();
    }
}
