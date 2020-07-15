import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();
        while (scanner.hasNext()) {
            String input = scanner.nextLine().trim();           // read lines to Arraylist
            if (input.equals("end")) {
                break;
            }
            arrayList.add(input);
        }

        int m = arrayList.get(0).split(" ").length;             // get String[] from Arraylist<String>
        int n = arrayList.size();
        String[][] array = new String[n][m];
        for (int i = 0; i < n; i++) {
            array[i] = arrayList.get(i).split(" ");
        }

        int[][] arrayInt = new int[n][m];                       // get int[] form String[]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrayInt[i][j] = Integer.parseInt(array[i][j]);
            }
        }

        int up;
        int down;
        int left;
        int right;

        int[][] resultArray = new int[n][m];                     // get resultArray
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                up = i == 0 ? n - 1 : i - 1;
                down = i == n - 1 ? 0 : i + 1;
                left = j == 0 ? m - 1 : j - 1;
                right = j == m - 1 ? 0 : j + 1;

                resultArray[i][j] = arrayInt[up][j] + arrayInt[down][j] + arrayInt[i][left] + arrayInt[i][right];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
