package ApnaCollegeCourse.L05Patterns;

import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        for(int i=a;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
