package ApnaCollegeCourse.L15BitManipulation;

import java.util.*;

public class counting1 {
    public static int countOne(int number){
        int count = 0;
        while(number>0){
            number=number&(number-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("The number of 1's in the number "+a+" is: "+countOne(a));
        sc.close();
    }
}
