package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
        String[][] tttBoard;
    public TicTacToe(String[][] board) {
        this.tttBoard = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return tttBoard[value];
    }

    public String[] getColumn(Integer value) {
        String [] column = new String[3];
        for (int i = 0; i < 3; i++) {
            column[i] = tttBoard[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        Boolean equal = Arrays.stream(row).allMatch(row[0]::equals);
        return equal;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        Boolean equal = Arrays.stream(column).allMatch(column[0]::equals);
        return equal;
    }

    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            if (isColumnHomogeneous(i)) {
                return getColumn(i)[0];
            }
            else if (isRowHomogenous(i)) {
                return getRow(i)[0];
            }
            else if (tttBoard[0][0].equals(tttBoard[1][1]) &&  tttBoard[0][0].equals(tttBoard[2][2]) ||
                    tttBoard[0][2].equals(tttBoard[1][1]) &&  tttBoard[1][1].equals(tttBoard[2][0])) {
                return tttBoard[1][1];
            }

        }
        return null;
    }

    public String[][] getBoard() {
        return tttBoard;
    }
}
