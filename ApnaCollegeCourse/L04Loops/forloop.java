package ApnaCollegeCourse.L04Loops;

import java.util.*;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            System.out.println(i+" from "+a);
        }
        sc.close();
    }
}
