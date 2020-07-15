import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int legth = scanner.nextInt();
        int[] array = new int[legth];
        for (int i = 0; i < legth; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int nPosition = 0;
        int mPosition = 0;
        for (int i = 1; i < legth; i++) {
            if (n == array[i]) {
                nPosition = i;
            }
            if (m == array[i]) {
                mPosition = i;
            }
        }
        System.out.println(Math.abs(nPosition - mPosition) == 1 ? true : false);
    }
}
