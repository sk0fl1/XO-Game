public class CoordChecker {
    public static int CoordChecking(String[][] game_board, String point, int x, int y) {
        int a = 1;
        if (point.equals("X")) {
            point = "O";
        } else if(point.equals("O")){
            point = "X";
        }
        if (x > game_board.length) {
            a = 0;
            System.out.println("Wrong coordinates");
        } else if(game_board[x][y].equals(point)){
            a = 0;
            System.out.println("No, this cell is already taken!");
        }
        return a;
        }
    }
