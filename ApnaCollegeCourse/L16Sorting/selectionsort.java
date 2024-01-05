package ApnaCollegeCourse.L16Sorting;

public class selectionsort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        int arr[] = {5,3,5,6,3,2,2};

        // Selection Sort
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        printArray(arr);
    }
}
