public class CheckWinner {
    public static int checking(int[][] game_board, int point) {
        int a = 0;

        if (game_board[0][0] == point & game_board[0][1] == point & game_board[0][2] == point) {
            a = 1;
        } if (game_board[0][0] == point & game_board[1][1] == point & game_board[2][2] == point) {
            a = 1;
        } if (game_board[2][0] == point & game_board[1][1] == point & game_board[0][2] == point) {
            a = 1;
        } if (game_board[0][0] == point & game_board[1][0] == point & game_board[2][0] == point) {
            a = 1;
        } if (game_board[0][1] == point & game_board[1][1] == point & game_board[2][1] == point) {
            a = 1;
        } if (game_board[0][2] == point & game_board[1][2] == point & game_board[2][2] == point) {
            a = 1;
        } if (game_board[1][0] == point & game_board[1][1] == point & game_board[1][2] == point) {
            a = 1;
        } if (game_board[2][0] == point & game_board[2][1] == point & game_board[2][2] == point) {
            a = 1;
        }
        return a;
    }
}
