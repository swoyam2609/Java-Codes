package ApnaCollegeCourse.L18RecursionII;

public class toh {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Moving "+src+" to "+dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);

        System.out.println("Moving "+src+" to "+dest);

        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        towerOfHanoi(4, "A", "B", "C");
    }
}
