import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        int[][] array = new int[n * n][n * n];

        for (int i = 0; i < n * n; i++) {           
            for (int j = 0; j < n * n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println(checkArrayForSquares(n, array) && checkSudArrayRowCol(n, array) ? "YES" : "NO");
    }



    public static boolean checkSudArrayRowCol(int n, int[][] array) {
        int[] exampleRow = new int[n * n];
        int[] temp = new int[n * n];

        for (int i = 0; i < exampleRow.length; i++) {
            exampleRow[i] = i + 1;
        }

        boolean sudRow = true;
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                temp[j] = array[i][j];
            }

            Arrays.sort(temp);
            sudRow = Arrays.equals(temp, exampleRow);
        }

        boolean sudColumn = true;
        for (int j = 0; j < n * n; j++) {
            for (int i = 0; i < n * n; i++) {
                temp[i] = array[i][j];
            }

            Arrays.sort(temp);
            sudColumn = Arrays.equals(temp, exampleRow);
        }

        return sudRow && sudColumn;
    }



    static boolean checkArrayForSquares(int n, int[][] array) {
        boolean[] checkSquare = new boolean[n * n];


        boolean sudoku = true;
        int count = 0;
        for (int i = 0; i < n * n; i += n) {
            for (int j = 0; j < n * n; j += n) {
                for (int k = i; k < i + n; k++) {
                    for (int l = j; l < j + n; l++) {
                        if (array[k][l] > n * n) {
                            return false;
                        }
                        checkSquare[array[k][l] - 1] = true;
                        count++;
                        if (count == n * n) {
                            count = 0;
                            for (int p = 0; p < checkSquare.length; p++) {
                                sudoku = sudoku && checkSquare[p];
                            }
                            if (!sudoku) {
                                return sudoku;
                            }
                        }
                    }
                }
            }
        }
        return sudoku;
    }
}
