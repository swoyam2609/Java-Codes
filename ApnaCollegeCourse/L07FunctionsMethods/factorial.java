package ApnaCollegeCourse.L07FunctionsMethods;

import java.util.*;

public class factorial {
    public static int factorialNumber(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorialNumber(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("The factorial of the number is: "+ factorialNumber(a));
        sc.close();
    }
}
