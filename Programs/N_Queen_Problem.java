public class N_Queen {

    static boolean isSafe(char board[][], int row, int col) {

        // For Vertical Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // For Diagonal left Up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // For Diagonal Right UP
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static void printchess(char board[][]) {
        System.out.println("----------chess Board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void queens_arrangement(char board[][], int row) {

        if (row == board.length) {
            printchess(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                queens_arrangement(board, row + 1);
                board[row][j] = 'x';
            }

        }
    }

    public static void main(String[] args) {

        int n = 4; // n is User Input 


        //Filling Each Cell with '.'
        char chess[][] = new char[n][n];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                chess[i][j] = '.'; 
            }
        }


        queens_arrangement(chess, 0);

    }
}
