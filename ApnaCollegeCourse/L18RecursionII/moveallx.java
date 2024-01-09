package ApnaCollegeCourse.L18RecursionII;

import java.util.Scanner;

public class moveallx {
    static StringBuilder moveAllX(StringBuilder str, int check) {
        if (check == str.length()) {
            return str;
        } else {
            if (str.charAt(check) == 'x') {
                str.delete(check, check+1);
                str.append('x');
            }

            return moveAllX(str, check + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String inputString = sc.nextLine();
        StringBuilder input = new StringBuilder(inputString);
        System.out.println("The string after moving all x to the end is: " + moveAllX(input, 0));
        sc.close();
    }
}
