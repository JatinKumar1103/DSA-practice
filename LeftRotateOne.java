package Array;

public class LeftRotateOne {
    public static void leftRotateOne(int[] arr){
        int temp = arr[0];
        for(int i =1 ; i< arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1  ] = temp;
    }
}
