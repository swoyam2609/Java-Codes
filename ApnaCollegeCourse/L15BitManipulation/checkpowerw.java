package ApnaCollegeCourse.L15BitManipulation;

import java.util.*;

public class checkpowerw {
    public static boolean check2(int number) {
        if ((number & (number - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int a = sc.nextInt();
        if (check2(a)) {
            System.out.println("It is a power of 2");
        } else {
            System.out.println("It is not a power of 2");
        }
        sc.close();
    }
}
