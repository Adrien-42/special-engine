import java.util.concurrent.TimeUnit;

//Holds the methods for creating a chessboard
public class ChessBoard {
    //Fills the chessboard with zeros, ie an empty space, so an error isn't returned when looking queens
    private void populate(int[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = 0;
            }
        }
    }
    //Prints out chessBoard in a human readable format
    public void printBoard(int[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] < 10) {
                    System.out.print(board[i][j] + "  ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        SortingAlgorithm check = new SortingAlgorithm();

        int[][] chessBoard = new int [8][8];

        board.populate(chessBoard);

        //Checks if there is 8 queens if not:
        //1. Sees if there is now queens, if so, does an initial run through of the board to place queens
        //2. Starting at the end of the board removes the last placed queen of the first loop, moves over a space then starts placing queens again
        //Problem: When there isn't enough queens at the end of a loop, moves to the last queen and removes it,
        //which would have been place by the loop, rather than going to the last one place by the initial loop
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(check.findCheck(chessBoard, j, i)){
                    check.placeQueen(chessBoard, j, i);
                }
            }
        }
        while(check.queenCount !=8){
            board.printBoard(chessBoard);
            System.out.println("Hi, I'm in the while loop");
            for(int k = 7; k>0; k--){
                for(int z = 7; z>0; z--){
                    System.out.println("Hi, I'm cycling through the board");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(chessBoard[z][k]==1){
                        System.out.println("Hi, I'm removing extra queens");
                        check.removeQueen(chessBoard,z,k);
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        board.printBoard(chessBoard);
                    }
                    check.loop(chessBoard, k+1, z);
                }
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        board.printBoard(chessBoard);
    }
}