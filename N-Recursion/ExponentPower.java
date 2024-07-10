public class ExponentPower {
    public static int calPower(int num , int power){
        if(power == 0){
            return 1;
        }
        int ans = num * calPower(num, power-1);
        return ans ;

    }
    public static void main(String[] args) {
        System.out.println(calPower(3,3));
    }
}
