package date_11_22;

public class ringsAndRods {
    public static void main(String[] args) {
        String rings="B0B6G0R6R0R6G9";
        System.out.println(countPoints(rings));
    }


    /**
     * @param rings
     * @return int
     * @description 使用位运算压缩数组,使其整型的二进制为111则表示三种颜色都存在
     */
    public static int countPoints1(String rings) {
        int[] state=new int[10];
        int n=rings.length();
        for(int i=0;i<n;i+=2)   {
            char color=rings.charAt(i);
            int poleIndex=rings.charAt(i+1)-'0';
            if(color=='R'){
                state[poleIndex]|=1;
            }else if(color=='G'){
                state[poleIndex]|=2;
            }else{
                state[poleIndex]|=4;
            }
        }
        int res=0;
        for (int j : state) {
            res += j == 7 ? 1 : 0;
        }
        return res;
    }
    /**
     * @param rings
     * @return int
     * @description 使用二维数组记录每一个杆存放的颜色圈,行为10个杆子,列为3种颜色,
     */
    public static int countPoints(String rings) {
        int[][] state=new int[10][3];
        int n=rings.length();
        for(int i=0;i<n;i+=2){
            char color=rings.charAt(i);
            int poleIndex=rings.charAt(i+1)-'0';
            state[poleIndex][getColorId(color)-1]=1;
        }
        int res=0;
        for (int[] ints : state) {
            if (ints[0] == 1 && ints[1] == 1 && ints[2] == 1) {
                res++;
            }
        }
        return res;
    }

    /**
     * @param c
     * @return int
     * @description  颜色所对应的列下标
     */
    public static int getColorId(char c){
        if(c=='R'){
            return 1;
        }else if(c=='G'){
            return 2;
        }
        return 3;
    }
}
