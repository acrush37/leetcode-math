package medium;

/*
    A Tic-Tac-Toe board is given as a string array board.
    Return True if and only if it is possible to reach this board position during the course of a valid tic-tac-toe game.

    The board is a 3 x 3 array, and consists of characters " ", "X", and "O".
    The " " character represents an empty square.
 */
public class ValidTic {

    public static void main(String... args) {

        String[] board = {"XXX", "XOO", "OO "};
        ValidTic validTic = new ValidTic();
        System.out.println(validTic.validTicTacToe(board));
    }

    public boolean validTicTacToe(String[] board) {

        int diff = 0;
        char[][] c = new char[3][3];
        c[0] = board[0].toCharArray();
        c[1] = board[1].toCharArray();
        c[2] = board[2].toCharArray();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (c[i][j] == 'X') diff++;
                else if (c[i][j] == 'O') diff--;

        if (diff != 0 && diff != 1) return false;

        int x = 0, o = 0;

        for (int i = 0; i < 3; i++) {

            if (c[i][0] == 'X' && c[i][1] == 'X' && c[i][2] == 'X') x++;
            if (c[i][0] == 'O' && c[i][1] == 'O' && c[i][2] == 'O') o++;
            if (c[0][i] == 'X' && c[1][i] == 'X' && c[2][i] == 'X') x++;
            if (c[0][i] == 'O' && c[1][i] == 'O' && c[2][i] == 'O') o++;
        }

        if (c[0][0] == 'X' && c[1][1] == 'X' && c[2][2] == 'X') x++;
        if (c[0][2] == 'X' && c[1][1] == 'X' && c[2][0] == 'X') x++;
        if (c[0][0] == 'O' && c[1][1] == 'O' && c[2][2] == 'O') o++;
        if (c[0][2] == 'O' && c[1][1] == 'O' && c[2][0] == 'O') o++;
        if (x == 1 && diff == 0 || o == 1 && diff == 1) return false;
        return true;
    }

}
