package ApnaCollegeCourse.L17Recursion;

import java.util.*;;

public class xn {
    public static int powerToN(int a, int b){
        if(b==0&&a!=0){
            return 1;
        }else if(a==0){
            return 0;
        }else{
            return a*powerToN(a, b-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be inserted: ");
        int a = sc.nextInt();
        System.out.print("Enter the power to be inserted: ");
        int b = sc.nextInt();
        System.out.println("The value of "+a+" raised to "+b+" is: "+powerToN(a, b));
        sc.close();

    }
}
