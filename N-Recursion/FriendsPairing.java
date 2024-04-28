public class FriendsPairing {
    public static int findPairs(int n){
        if(n ==1 || n==2){
            return n;
        }
//        int singleChoice = findPairs(n-1);
//        int doubleChoice = (n-1) * findPairs(n-2);
//        int totalWays = singleChoice + doubleChoice;
//        return totalWays;
        return findPairs(n-1) + (n-1) * findPairs(n-2);
    }
    public static void main(String[] args) {
        System.out.println(findPairs(3));
    }
}
