import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        int x = 0;
        int y = 0;
        int z = n;
        for (int i = 0, j = n * n; i < j;) {
            array[y][x] = ++i;

            if (x < z + (n - z) / 2 - 1 && y == (n - z) / 2) {
                x++;
            } else if (x == z + (n - z) / 2 - 1 && y < z + (n - z) / 2 - 1) {
                y++;
            } else if (x > (n - z) / 2 && y == z + (n - z) / 2 - 1) {
                x--;
            } else if (x == (n - z) / 2 && y > (n - z) / 2 + 1) {
                y--;
            } else {
                x++;
                z -= 2;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}