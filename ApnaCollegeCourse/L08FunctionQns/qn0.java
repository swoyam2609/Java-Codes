package ApnaCollegeCourse.L08FunctionQns;

import java.util.*;

public class qn0 {
    public static int average(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers separated by a space");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("Average of the three numbers is: ");
        System.out.println(average(a, b, c));
        sc.close();
    }
}
