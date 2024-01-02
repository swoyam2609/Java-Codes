package ApnaCollegeCourse.L04Loops;

import java.util.*;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
            System.out.println("The value of a is "+a);
            a--;
        }
        sc.close();
    }
}
