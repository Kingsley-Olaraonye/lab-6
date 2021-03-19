
/*
    This is the work of Kingsley Olaraonye
*/

public class TestQB{

    public static void main(String[] args) {

        QBoard qb = new QBoard(9); // create a 9 by 9 chessboard
        
         for (int col = 1; col < qb.columnSize(); col++) {
            qb.putQueen(0, col, QBoard.BLUE);
        }
    }
}
