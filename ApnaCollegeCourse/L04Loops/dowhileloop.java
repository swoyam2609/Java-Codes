package ApnaCollegeCourse.L04Loops;

import java.util.*;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        do{
            System.out.println("the value of a is "+a);
            a--;
        }while(a>0);
        sc.close();
    }
}
