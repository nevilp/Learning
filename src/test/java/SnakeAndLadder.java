/*** Created By nevil.panchal on 4/6/2021 year 2021 ***/






import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class SnakeAndLadder {

    static class CellNode {
        int index; // Vertex number
        int ThrowCount;
        // distance of this vertex from source

        @Override
        public String toString() {
            return "CellNode{" +
                    "index=" + index +
                    ", ThrowCount=" + ThrowCount +
                    '}';
        }
    };

    static int MinimumDiceThrows(int board[], int N) {

        boolean[] visited = new boolean[N];



        for (int i = 0; i < N; i++) {
            visited[i] = false;
        }

        Queue<CellNode> pipe = new LinkedList<CellNode>();

        visited[0] = true;
        CellNode startCellNode = new CellNode();
        startCellNode.ThrowCount = 0;
        startCellNode.index = 0;
        pipe.add(startCellNode);

       CellNode topQueRemoved = new CellNode();

        while (!pipe.isEmpty()) {
            System.out.println(Arrays.toString(visited));
            topQueRemoved = pipe.peek();
            int removedIndex = topQueRemoved.index;

            if (removedIndex == N - 1){
                break;
            }
            System.out.println(pipe.toString());
            pipe.remove();
            for (int i = removedIndex + 1; i <= (removedIndex + 6) && i < N; i++) {

                if (visited[i] == false) {


                    CellNode cellNode = new CellNode();
                    cellNode.ThrowCount = (topQueRemoved.ThrowCount + 1);
                    visited[i] = true;
                    if (board[i] != -1){

                        cellNode.index = board[i];

                    }else{

                        cellNode.index = i;

                    }
                    pipe.add(cellNode);

                }
            }
        }

        return topQueRemoved.ThrowCount;
    }

    public static void main(String[] args) {

        int N = 30; // number of cells
        int[] board = new int[N];
        for (int i = 0; i < N; i++)
            board[i] = -1;

        // Ladders
        board[2] = 21;
        board[4] = 7;
        board[10] = 25;
        board[19] = 28;

        // Snakes
        board[26] = 0;
        board[20] = 8;
        board[16] = 3;
        board[18] = 6;

        System.out.println("Minimum number of controlled dice throws are: "
                + MinimumDiceThrows(board, N));

    }

}
