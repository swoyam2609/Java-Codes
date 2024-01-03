package ApnaCollegeCourse.L08FunctionQns;

import java.util.*;

public class qn3 {
    public static double circumference(double radius){
        return 2*Math.PI*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("The circumference of the circle is: "+circumference(radius));
        sc.close();
    }
}
