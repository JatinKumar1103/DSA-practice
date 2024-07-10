public class Fibonacci {
    public  static int fib(int n){
       if(n == 0 || n == 1){
           return n ;
       }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm2 + fnm1;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
//O(n) space complexity
//o(2^n) time complexity
