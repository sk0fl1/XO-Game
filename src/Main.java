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
        int count;
        int x;
        int y;
        CheckWinner checkWinner = new CheckWinner();
        int win_result = 0;
        System.out.println("");
        System.out.println("Write '1', if u wanna play 'X', or write 'O', if u wanna play 'O'");
        int player_answer;
        do {
            player_answer = scanner.nextInt();
        } while (player_answer != 1 & player_answer != 0);
        if (player_answer == 0) {
            count = 1;
        } else {
            count = 0;
        }
        do {
            System.out.println("");
            if(count%2 == 0) {
                placed_point = "X";
            } else {
                placed_point = "O";
            }
            if(placed_point.equals("X")) {
                System.out.println(placed_point + " is playing now");
            } else {
                System.out.println(placed_point + " is playing now");
            }
            do {
                System.out.println("Write x coordinate: ");
                x = scanner.nextInt();
                System.out.println("Write y coordinate: ");
                y = scanner.nextInt();
            } while (CoordChecker.CoordChecking(game_board, placed_point, x, y) != 1);
            game_board[x][y] = placed_point;
            if (CheckWinner.checking(game_board, placed_point) == 1) {
                win_result = 1;
            }
            count ++;
            if(count%2 == 0) {
                placed_point = "X";
            } else {
                placed_point = "O";
            }
            AIGenerator aiGenerator = new AIGenerator();
            game_board[aiGenerator.AiPlaced(game_board,placed_point)[0]][aiGenerator.AiPlaced(game_board,placed_point)[1]] = placed_point;
            for(int i = 0; i < game_board.length; i++){
                System.out.println("\n");
                for(int j = 0;j < game_board.length; j++){
                    System.out.print(game_board[i][j] + "   ");
                }
            }
            if (CheckWinner.checking(game_board, placed_point) == 1) {
                win_result = 1;
            }
            count++;
            }
            while (win_result != 1);
        if(count%2 == 0) {
            placed_point = "X";
        } else {
            placed_point = "O";
        }
            System.out.println("\n" + placed_point + " Win!!!");
    }
}
