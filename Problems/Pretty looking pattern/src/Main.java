import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] array = new char[4][4];

        for (int i = 0; i < 4; i++) {
            array[i] = scanner.nextLine().toCharArray();
        }

        boolean pretty = true;
        char temp;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                temp = array[i][j];
                if (array[i + 1][j + 1] == temp && array[i][j + 1] == temp && array[i + 1][j] == temp) {
                    pretty = false;
                }
            }
        }
        System.out.println(pretty ? "YES" : "NO");
    }
}
