package ApnaCollegeCourse.L05Patterns;

import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
