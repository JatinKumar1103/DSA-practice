public class FirstOccurence {
    public static int firstoccurence(int arr[], int n , int key){
        if( n == arr.length ){
            return -1;
        }
        if( arr[n] == key){
            return n;
        }
        return firstoccurence(arr, n+1, key);

    }

    public static int lastOccurence(int arr[], int n, int key){

        if(n == -1){
            return -1;
        }
        if(arr[n] == key ){
            if(n == arr.length-1){
                return arr.length -n;
            }
            return n;
        }
        return lastOccurence(arr,n-1,key);

    }
    public static void main(String[] args){
//        int arr[] ={ 4,3,4,5};
//        System.out.println(firstoccurence(arr,0,6));
        int arr [] = {8,3,2,4,3,10};
        System.out.println(lastOccurence(arr, arr.length-1, 8 ));

    }
}
