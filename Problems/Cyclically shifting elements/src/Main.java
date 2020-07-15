import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[scanner.nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int[] resultArray = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                resultArray[0] = a[i];
            }   else {
                resultArray[i + 1] = a[i];
            }
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
