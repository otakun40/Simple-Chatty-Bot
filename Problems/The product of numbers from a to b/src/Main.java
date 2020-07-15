import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        long product = 1;

        for (int i = begin; i < end; i++) {
            product *= i;
        }

        System.out.println(product);
    }
}
