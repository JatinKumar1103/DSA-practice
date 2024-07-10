public class QuickSort {
    public static void quickSort(int arr[], int si , int ei){
        if(si>= ei){
            return ;
        }
        int pidx = partition(arr,si,ei);
        quickSort(arr,si,pidx-1);//for sorting in LHS
        quickSort(arr,pidx+1,ei);//for sorting in RHS

    }

    private static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si -1;
        for(int j = si ; j< ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; //pivot = arr[i] not allowed because it is variable we cant change variable
        arr[i] = temp;
        return i;
    }

    public static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length  ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    int arr[] = { 2,5,6,7,1,-2};
    quickSort(arr,0 , arr.length-1);
    printArray(arr);
    }
}
