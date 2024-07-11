package Array;

import java.util.Arrays;

public class LeftRotateByK {

    public static void brute(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void optimal(int arr[], int k) {
        Reverse.reverseArr(arr, arr.length - k, arr.length - 1);
        Reverse.reverseArr(arr, 0, arr.length - k - 1);
        Reverse.reverseArr(arr, 0, arr.length - 1);

    }


}
