package ApnaCollegeCourse.L05Patterns;

import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<(a-i-1);j++){
                System.out.print("  ");
            }
            for(int j=0;j<(1+i);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
