package ApnaCollegeCourse.L16Sorting;

public class bubblesort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        int arr[] = {5,3,5,6,3,2,2};
        
        // Bubble Sort
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        printArray(arr);
    }
}
