public class ChangeArray {
    public static void changeArr(int arr[], int i){
        if(i == arr.length){
            printArr(arr);
            return;
        }
        arr[i] = i + 1;
        changeArr(arr,i+1);
        arr[i] = arr[i] - 2;
    }
    public static void printArr(int arr[]){
        for( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = new int[5];
        changeArr(arr, 0);
        printArr(arr);

    }
}
