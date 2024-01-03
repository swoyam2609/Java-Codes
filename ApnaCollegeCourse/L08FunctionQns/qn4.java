package ApnaCollegeCourse.L08FunctionQns;

import java.util.*;;

public class qn4 {
    public static boolean voteEligibility(int age){
        if (age >= 18){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(voteEligibility(age)){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are a minor");
        }
        sc.close();
    }
}
