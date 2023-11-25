package leetcode2023.date_11_25;

public class Search2DMatrix {

    public static void main(String[] args) {
        int [][]m=new int[][]{{1},{3}};
        System.out.println(searchMatrix(m, 3));
    }


    //试了n次,终于是过了,写的珍尼玛水 T_T
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        while(target<=matrix[matrix.length-1][matrix[0].length-1]   &&matrix[row][matrix[row].length-1]<target){
            row++;
        }
        return binarSsearch(row,matrix,target);
    }

    public static boolean binarSsearch(int row,int[][]matrix,int target){
        int left=0,right=matrix[row].length-1;
        while(left<=right){
            if((left==right-1 || left==right) && matrix[row][left]!=target && matrix[row][right]!=target){
                return false;
            }
            if(matrix[row][(left+right)/2]==target){
                return true;
            }else if(matrix[row][(left+right)/2]>target){
                right=(left+right+1)/2;
            }else{
                left=(left+right+1)/2;
            }
        }
        return false;
    }
}
