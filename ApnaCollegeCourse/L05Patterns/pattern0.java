package ApnaCollegeCourse.L05Patterns;

import java.util.*;

public class pattern0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ebter the height of the rectangle: ");
        int h = sc.nextInt();
        System.out.print("Enter the breadth of the rectange: ");
        int b = sc.nextInt();
        for(int i=0;i<h;i++){
            for(int j=0;j<b;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

}
