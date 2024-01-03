package ApnaCollegeCourse.L08FunctionQns;

import java.util.*;

public class qn2 {
    public static int greaterNumber(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers separated by a space");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greater of the two numbers is: "+greaterNumber(a, b));
        sc.close();
    }
}
