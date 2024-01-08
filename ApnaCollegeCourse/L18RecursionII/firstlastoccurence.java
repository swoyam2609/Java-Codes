package ApnaCollegeCourse.L18RecursionII;

import java.util.Scanner;

public class firstlastoccurence {
    static int firstOccurence(int check, char toFind, String input){
        if(input.charAt(0)==toFind){
            return check;
        }else{
            return firstOccurence(check+1, toFind, input.substring(1));
        }
    }

    static int lastOccurence(int check, char toFind, String input){
        if(input.charAt(input.length()-1)==toFind){
            return check;
        }else{
            return lastOccurence(check-1, toFind, input.substring(0, input.length()-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String input = sc.nextLine();
        System.out.print("Enter your character: ");
        String toFind = sc.next();
        char toFindChar = toFind.charAt(0);
        System.out.println(firstOccurence(0, toFindChar, input));
        System.out.println(lastOccurence(input.length()-1, toFindChar, input));
        sc.close();
    }
}
