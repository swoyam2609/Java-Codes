package ApnaCollegeCourse.L07FunctionsMethods;

import java.util.*;

public class code {
    public static void printName(String name){
        System.out.println("My name is "+ name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = sc.nextLine();
        printName(name);
        sc.close();
    }
}
