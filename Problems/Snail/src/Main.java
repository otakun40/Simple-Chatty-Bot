import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0, y = 1;; y++) {
            i += a;
            if (i >= h) {
                System.out.println(y);
                break;
            } else {
                i -= b;
            }
        }
    }
}
