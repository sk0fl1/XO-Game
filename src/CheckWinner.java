public class CheckWinner {
    public static int checking(String[][] game_board, String point) {
        int a = 0;

        if (game_board[0][0].equals(point) & game_board[0][1].equals(point) & game_board[0][2].equals(point)) {
            a = 1;
        } if (game_board[0][0].equals(point) & game_board[1][1].equals(point) & game_board[2][2].equals(point)) {
            a = 1;
        } if (game_board[2][0].equals(point) & game_board[1][1].equals(point) & game_board[0][2].equals(point)) {
            a = 1;
        } if (game_board[0][0].equals(point) & game_board[1][0].equals(point) & game_board[2][0].equals(point)) {
            a = 1;
        } if (game_board[0][1].equals(point) & game_board[1][1].equals(point) & game_board[2][1].equals(point)) {
            a = 1;
        } if (game_board[0][2].equals(point) & game_board[1][2].equals(point) & game_board[2][2].equals(point)) {
            a = 1;
        } if (game_board[1][0].equals(point) & game_board[1][1].equals(point) & game_board[1][2].equals(point)) {
            a = 1;
        } if (game_board[2][0].equals(point) & game_board[2][1].equals(point) & game_board[2][2].equals(point)) {
            a = 1;
        }
        return a;
    }
}
