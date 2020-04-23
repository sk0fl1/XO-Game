public class CordCheker {
    public static int CoordChecking(int[][] game_board, int point, int x, int y) {
        int a = 1;
        if (point == 0) {
            point = 1;
        } else if(point == 1){
            point = 0;
        }
        if (x > game_board.length) {
            a = 0;
            System.out.println("Wrong coordinates");
        } else if(game_board[x][y] == point){
            a = 0;
            System.out.println("No, this cell is already taken!");
        }
        return a;
        }
    }
