public class TilingProblem {
    public static int findWays(int n){//for 2*n floor
        //base condition
        if(n == 0  || n == 1){
            return 1;
        }
        //function
        int verticalWay = findWays(n-1);
        int horizontalWay = findWays(n-2);
        int totalWays = verticalWay + horizontalWay;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(findWays(4));
    }
}
