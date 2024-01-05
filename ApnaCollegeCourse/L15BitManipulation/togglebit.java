package ApnaCollegeCourse.L15BitManipulation;

import java.util.*;;

public class togglebit {
    public static int setBit(int pos, int number){
        int settingNumber=1<<pos;
        int newNumber = number | settingNumber;
        return newNumber;
    }

    public static int clearBit(int pos, int number){
        int settingNumber = 1<<pos;
        settingNumber = ~(settingNumber);
        int newNumber = number & settingNumber;
        return newNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be toggled: ");
        int a = sc.nextInt();
        System.out.print("Enter the position to be toggled: ");
        int b = sc.nextInt();
        int checkingNumber = 1 << b;
        int checkedNumber = a & checkingNumber;
        if(checkedNumber==0){
            a= setBit(b, a);
        }else{
            a=clearBit(b, a);
        }
        System.out.println("The new number after toggling is: "+a);
        sc.close();
    }
}
