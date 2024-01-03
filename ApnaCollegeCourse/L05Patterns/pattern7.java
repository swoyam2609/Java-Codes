package ApnaCollegeCourse.L05Patterns;

import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=0;j<i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}
