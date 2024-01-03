package ApnaCollegeCourse.L07FunctionsMethods;

import java.util.*;

public class code1 {
    public static int sumTwo(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The sum of the two numbers is: "+sumTwo(a, b));
        sc.close();
    }
}
