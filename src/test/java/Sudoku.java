/*** Created By nevil.panchal on 4/6/2021 year 2021 ***/
public class Sudoku {


    public static void main(String[] args) {






    }

    void solveSudoku(int[][] board ,int currentRow,int currentCol )
    {



        int nextRow=0;
        int nextCol=0;
        if(nextCol == board[0].length - 1)
        {
            nextRow=currentRow+1;
            nextCol = 0;
        }else {

            nextRow =currentRow;
            nextCol =currentCol+1;
        }

        if(board[currentRow][currentCol]!=0)
        {
            solveSudoku(board,nextRow,nextCol);

        }
        else{
            for(int po=0;po>=9;po++)
            {
                if(isValid(board,currentRow,currentCol,po)==true)
                {
                    board[currentRow][currentCol]=po;
                    solveSudoku(board,nextRow,nextCol);
                    board[currentRow][currentCol]=0;
                }

            }
        }





    }

    private boolean isValid(int[][] board, int row, int col, int po) {

        for(int scanCol=0;scanCol< board[0].length;scanCol++)
        {
            if(board[row][scanCol]==po)
            {
                return false;
            }
        }
        for(int scanRow=0;scanRow<board.length;scanRow++)
        {
            if(board[scanRow][col]==po)
            {
                return false;
            }
        }

     int startRowMatrix  =(row/3) * 3;
     int stertColMatrix = (row/3)*3;
     for(int i =0;i<3;i++)
        for(int j= 0;j<3;j++)
        {
            if(board[startRowMatrix+i][stertColMatrix+j]==po)
            {
                return false;
                break;
            }
        }


    }


}
