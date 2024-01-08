package ApnaCollegeCourse.L18RecursionII;

import java.util.Scanner;

public class stringreverse {
    static String stringReverse(String input){
        if(input.length()==1){
            return input;
        }else{
            return stringReverse(input.substring(1)) + input.substring(0, 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("The reverse string is: "+ stringReverse(input));
        sc.close();
    }
}
