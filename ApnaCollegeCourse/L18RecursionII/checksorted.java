package ApnaCollegeCourse.L18RecursionII;

public class checksorted {
    static boolean checkInteresting(int[] arr, int check){
        if(check==arr.length-1){
            return true;
        }else if(arr[check]>arr[check+1]){
            return false;
        }else{
            return checkInteresting(arr, check+1);
        }
    }

    public static void main(String[] args) {
        // int[] arr = {34,26,475,2426,37,234};
        int[] arr = {1,2,3,4,5,6,7,8};

        if(checkInteresting(arr, 0)){
            System.out.println("The array is sorted");
        }else{
            System.out.println("the array is not sorted");
        }
    }
}
