package leetcode2024.date_3;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }


    public static int maxArea(int[] height) {
        int capcity=0,i=0,j= height.length-1;
        while(i<j){
            capcity=height[i]> height[j] ? Math.max(capcity,(j-i)*height[j--]):Math.max(capcity,(j-i)*height[i++]);
        }
        return capcity;
    }
}
