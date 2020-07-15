import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int result = 0;
        int n;

        for (int i = 0; i < len; i++) {
            n = scanner.nextInt();
            if (n % 4 == 0 && n > result) {
                result = n;
            }
        }

        System.out.println(result);
    }
}
