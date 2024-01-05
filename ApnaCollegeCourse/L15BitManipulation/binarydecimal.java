package ApnaCollegeCourse.L15BitManipulation;

import java.util.Scanner;

public class binarydecimal {
    public static StringBuilder decimalToBinary(int number){
        StringBuilder ans = new StringBuilder();
        while(number>0){
            int rem = number%2;
            ans.insert(0, Integer.toString(rem));
            number/=2;
        }
        return ans;
    }

    public static int binaryToDecimal(StringBuilder number){
        number.reverse();
        int ans = 0;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)=='0'){
                continue;
            }else{
                ans+=Math.pow(2, i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to convert to binary: ");
        int a = sc.nextInt();
        System.out.println("The converted binary equivalent is: "+decimalToBinary(a));
        System.out.print("Enter the binary number to conver to decimal: ");
        String b = sc.next();
        StringBuilder c = new StringBuilder(b);
        System.out.println("The converted decimal equivalent is: "+binaryToDecimal(c));
        sc.close();
    }
}
