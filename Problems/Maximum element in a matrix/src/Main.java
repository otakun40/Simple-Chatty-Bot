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

        int stringMaxIndex = 0;
        int columnMaxIndex = 0;
        int max = array2d[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < array2d[i][j]) {
                    stringMaxIndex = j;
                    columnMaxIndex = i;
                    max = array2d[i][j];
                }
            }
        }

        System.out.println(columnMaxIndex + " " + stringMaxIndex);
    }
}
