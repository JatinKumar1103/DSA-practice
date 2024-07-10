public class NaturalSum {
    public static int calSum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = calSum(n-1);
        int sum = n + Snm1;
        return sum ;
    }
    public static void main(String[] args) {
        System.out.println(calSum(5));
    }
}
