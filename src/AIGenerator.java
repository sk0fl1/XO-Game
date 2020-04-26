import java.util.Random;
public class AIGenerator {
    public static int[] AiPlaced(String[][] game_board, String point) {
        CoordChecker coordChecker = new CoordChecker();
    int a;
    int b;
    int[] coords = new int[2];
    do {
        Random random = new Random();
        int max = 2;
        int min = 0;
        int diff = max - min;
        a = random.nextInt(diff + 1);
        b = random.nextInt(diff+1);
    } while (coordChecker.CoordChecking(game_board, point,a,b) != 1);
    coords[0] = a;
    coords[1] = b;
    return coords;
    }
}
