package ApnaCollegeCourse.L16Sorting;

public class insertionsort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        int arr[] = {5,3,5,6,3,2,2};

        // Insertion sort
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int current = arr[i];
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        printArray(arr);
    }
}
