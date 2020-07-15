import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int countN = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] == n) {
                countN++;
            }
        }
        System.out.println(countN);
    }
}