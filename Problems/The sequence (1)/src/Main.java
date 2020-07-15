import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seq = scanner.nextInt();
        int n = 0;

        for (int i = 1; i <= seq; i++) {
            if (n == seq) {
                break;
            }
            for (int j = 1; j <= i; j ++) {
                System.out.print(i + " ");
                n++;
                if (n == seq) {
                    break;
                }
            }
        }
    }
}