package ApnaCollegeCourse.L05Patterns;

import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the rectangle: ");
        int h = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        for(int i=0;i<h;i++){
            for(int j=0;j<b;j++){
                if(j==0 || j==(b-1) || i==0 || i==h-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
