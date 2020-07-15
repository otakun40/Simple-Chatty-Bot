import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] array = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = ".";
            }
        }

        for (int i = 0, x = n - 1; i < n; i++, x--) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    array[n / 2][j] = "*";
                }
                if (j == n / 2) {
                    array[i][n / 2] = "*";
                }
                if (Math.abs(j - i) == 0) {
                    array[i][j] = "*";
                    array[x][j] = "*";
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
