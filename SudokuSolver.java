public class SudokuSolver {
//Sudoku Solver for a nXn matrix and grids
    public boolean isSafe(char board[][], int row, int col, int num){

        // check for row and column
        for(int i=0; i<board.length; i++){
            if(board[row][i] == (char)('0' + num)){
                return false;
            }
            if(board[i][col] == (char)('0' + num)){
                return false;
            }
        }

        //check in grid
        int startrow = (row/3) * 3;
        int startcol = (col/3) * 3;

        for(int i=startrow; i<startrow + 3; i++){
            for(int j=startcol; j<startcol + 3; j++){
                if(board[i][j] == (char)('0' + num)){
                    return false;
                }
            }
        }
        return true;
    }


    public boolean helper(char board[][], int row, int col){
        //helper class

        if(row == board.length){
            return true;
        }

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
        if(board[row][col] != '.'){
            if(helper(board, newRow, newCol)){
                return true;
            }
            else{
                for(int i; i<=9; i++){
                    if(isSafe(board, row, col, i)){
                        board[row][col] = (char)('0' + i);
                        if(helper(board, newRow, newCol)){
                            return true;
                        }
                        else{
                            board[row][col] = '.';
                        }

            }
        }
        return false;
    }
    public void solveSudoku(char board[][]){
        //solving method 
        helper(board, 0, 0)

    }
}
