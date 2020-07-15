import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array2d = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array2d[i][j] = scanner.nextInt();
            }
        }

        int column1 = scanner.nextInt();
        int column2 = scanner.nextInt();

        int temp;

        for (int i = 0; i < n; i++) {
            temp = array2d[i][column1];
            array2d[i][column1] = array2d[i][column2];
            array2d[i][column2] = temp;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
