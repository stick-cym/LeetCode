package leetcode2024.date_2;

import java.util.Arrays;
import java.util.Scanner;

public class 美团折扣 {
    public int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println("请输入一个正整数代表几个菜:");
        int n=new Scanner(System.in).nextInt();
        double[][] food=new double[n][n];
        for (int i = 0; i < n; i++) {
            Scanner scanner = new Scanner(System.in);
            food[i][0]=scanner.nextDouble();
            food[i][1]=scanner.nextDouble();
            if(food[i][0] < food[i][1]){
                System.out.println("error");
                return;
            }
        }
        System.out.println("请输入折扣规则:");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        double discount=scanner.nextDouble();
        if(price<discount){
            System.out.println("error");
            return;
        }
        double sum;
        double discountSum=0;
        sum = Arrays.stream(food).mapToDouble(s -> s[0]).sum();
        discountSum=Arrays.stream(food).mapToDouble(s->s[1]).sum();
        if(sum<price || sum-discount > discountSum){
            System.out.println(discountSum);
            return;
        }
        System.out.println(sum-discount);
        美团折扣 m=new ssss();
    }
}

class ssss extends 美团折扣{
    public int min(int a,int b){
        return a>b? b:a;
    }
}
