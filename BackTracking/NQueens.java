public class NQueens {
    public static boolean isSafe(char board[][],int row, int col){
        //vertical
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonal left
        for(int i = row- 1 , j = col - 1 ; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // diagonal right
        for(int i = row - 1 , j = col + 1 ; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }

    public static boolean nQueens(char board[][] , int row){
        if(row == board.length){
            count++;
//            printAns(board);
            return true;
        }
        for( int j = 0 ; j< board.length; j++){
           if(isSafe(board,row,j)){
               board[row][j] = 'Q';
               if(nQueens(board,row+1)){
                   return true;
               }
               board[row][j] = 'x';
           }
        }
        return false;
    }
    public static void printAns(char board[][]){
        System.out.println("-------chess------");
        for(int i = 0 ; i < board.length; i++){
            for(int j = 0 ; j< board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String args[]){
        int n = 2;
        char board[][] = new char [n][n];

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n ; j++ ){
                board[i][j] = 'x';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("solution exists");
            printAns(board);
        }else{
            System.out.println("solution doesn't exist");
        }
//        System.out.println("total number of ways are : " +count);
    }
}
