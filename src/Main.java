import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        //Creating game board
        int l_board_x = 3, l_board_y = 3;
        Scanner scanner = new Scanner(System.in);
        String[][] game_board= new String[l_board_x][l_board_y];
        for(int i = 0; i < game_board.length; i++){
            for(int j = 0;j < game_board.length; j++){
                game_board[i][j] = "|  |";
            }
        }
        int[] player_0 = new int[l_board_x];
        int[] player_1 = new int[l_board_x];
        //Show game board
        for(int i = 0; i < game_board.length; i++){
            System.out.println("\n");
            for(int j = 0;j < game_board.length; j++){
                    System.out.print(game_board[i][j] + "   ");
            }
        }
        //Game
        String placed_point;
        int count = 1;
        int x;
        int y;
        do {
            System.out.println("");
            if(count%2 == 0) {
                placed_point = "X";
            } else {
                placed_point = "O";
            }
            count++;
            if(placed_point.equals("X")) {
                System.out.println("X is playing now");
            } else {
                System.out.println("O is playing now");
            }
            do {
                System.out.println("Write x coordinate: ");
                x = scanner.nextInt();
                System.out.println("Write y coordinate: ");
                y = scanner.nextInt();
            } while (CoordChecker.CoordChecking(game_board, placed_point, x, y) != 1);
            game_board[x][y] = placed_point;
            for(int i = 0; i < game_board.length; i++){
                System.out.println("\n");
                for(int j = 0;j < game_board.length; j++){
                    System.out.print(game_board[i][j] + "   ");
                }
            }
            CheckWinner checkWinner = new CheckWinner();}
            while (CheckWinner.checking(game_board, placed_point) != 1);
            System.out.println("\n" + placed_point + " Win!!!");



    }
}
