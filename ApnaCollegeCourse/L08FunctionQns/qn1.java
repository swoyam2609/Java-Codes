package ApnaCollegeCourse.L08FunctionQns;

import java.util.*;

public class qn1 {
    public static int sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till which sum is needed to be calculated: ");
        int a = sc.nextInt();
        System.out.println("The sum of all add numbers till "+a+" is: "+sumOfOdd(a));
        sc.close();
    }
}
