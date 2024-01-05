package ApnaCollegeCourse.L17Recursion;

import java.util.*;

public class fibonacci {
    public static void fibonacciSeries(int a, int b, int n){
        if(n==0){
            return;
        }else{
            System.out.print(a+" ");
            fibonacciSeries(b, a+b, n-1);
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci terms to be printed: ");
        int a = sc.nextInt();
        fibonacciSeries(0, 1, a);
        System.out.println();
        sc.close();
    }
}
