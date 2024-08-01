package Array;

public class Factorial {
    static int ans = 1;

    public static int factorial(int num) {
        while (num > 1) {
            ans *= num;
            num--;
        }
        return ans;
    }

}
