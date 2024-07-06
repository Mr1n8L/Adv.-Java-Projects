public class SudokuSolver {
    public boolean helper(char board[][], int row, int col){

        int newRow = 0;
        int newCol = 0;
        if(col != board.length - 1){
            newRow = row;
            newCol = col + 1;
        }
        else{
            newRow = row + 1;
            newCol = 0;
        }

    }
    public void solveSudoku(char board[][]){
        helper(board, 0, 0)

    }
}
