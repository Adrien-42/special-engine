import java.util.concurrent.TimeUnit;

//Holds methods for getting info about and modifying the chessboard
public class SortingAlgorithm {
    public int queenCount = 0;      //Variable to check the number of queens on the board

    //Takes a 2-D array of int and an x-y coordinate, then checks if there is a queen at the coordinate
    /*public boolean squareOccupied(int[][] arr, int x, int y) {
        if (arr[x][y] == 1) {
            return true;
        }
        return false;
    }*/
    //Takes a 2-D array of int and an x-y coordinate, places a queen at the coordinate, then increases queen count by one
    public void placeQueen(int[][] arr, int x, int y) {
        arr[x][y] = 1;
        queenCount++;
    }
    //Takes a 2-D array of int and an x-y coordinate, removes a queen at the coordinate, then deceases queen count by one
    public void removeQueen(int[][] arr, int x, int y) {
        arr[x][y] = 0;
        queenCount--;
    }
    //Takes a 2-D array of int and an x-y coordinate,
    //loops through every square in the array and checks if it is in check with the coordinate and returns false,
    //otherwise returns true
    public boolean findCheck(int[][] arr, int x, int y) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == x & i != y & arr[j][i] == 1) {
                    //System.out.println("False");
                    return false;
                } else if (i == y & j != x & arr[j][i] == 1) {
                    //System.out.println("False");
                    return false;
                } else if (i + j == x + y & arr[j][i] == 1) {
                    //System.out.println("False Diagonal");
                    return false;
                } else if (((y - i) == (x - j)) & arr[j][i] == 1) {
                    //System.out.println("False Diagonal");
                    return false;
                }
            }
        }
        //System.out.println("True Sort");
        return true;
    }
    //Sees if queenCount == 8, ie there is 8 queens on the board,
    //if there isn't, returns false, if there is returns true
    /*public boolean queenFinished() {
        if (queenCount == 8) {
            return true;
        }
        return false;
    }*/
    //Takes a 2-D array of int and an x-y coordinate, starts a loop through of array at coordinate
    //Uses findCheck to see if current locations is in check
    //if not, runs placeQueen.
    //Waits a second before exiting
    public void loop(int[][] board, int x, int y) {
        for (int k = y; k < 8; k++) {
            for (int z = x; z < 8; z++) {
                if (findCheck(board, z, k)) {
                    placeQueen(board, z, k);
                }
            }
        }
        //Cleans up board
        if(queenCount!=8){
            for(int i=y; i<8; i++){
                for(int j=x; j<8; j++){
                    if(board[j][i] == 1){
                        removeQueen(board, j, i);
                    }
                }
            }
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}