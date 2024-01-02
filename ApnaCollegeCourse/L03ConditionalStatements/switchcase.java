package ApnaCollegeCourse.L03ConditionalStatements;

import java.util.*;;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("the value is 1");
                break;
            case 2:
                System.out.println("the value is 2");
                break;
            case 3:
                System.out.println("the value is 3");
                break;
        
            default:
                break;
        }
        sc.close();
    }
}
