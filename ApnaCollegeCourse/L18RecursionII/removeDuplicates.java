package ApnaCollegeCourse.L18RecursionII;

import java.util.Scanner;

public class removeDuplicates {
    static String removeDuplicate(String input, int idx, boolean[] arr) {
        if (idx == input.length()) {
            return "";
        } else {
            char thisChar = input.charAt(idx);
            if (arr[thisChar - 'a']) {
                return removeDuplicate(input, idx + 1, arr);
            } else {
                arr[thisChar-'a']=true;
                return thisChar + removeDuplicate(input, idx + 1, arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String input = sc.nextLine();
        boolean[] arr = new boolean[input.length()];
        System.out.println("The String after removing the duplicates is : " + removeDuplicate(input, 0, arr));
        sc.close();
    }
}
