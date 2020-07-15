import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int res1 = scanner.nextInt() > 0 ? 1 : 0;
        int res2 = scanner.nextInt() > 0 ? 1 : 0;
        int res3 = scanner.nextInt() > 0 ? 1 : 0;

        System.out.println(res1 + res2 + res3 == 1);
    }
}
