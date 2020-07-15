import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int maxDiv4 = 0;
        while (num > 0) {
            int i = scanner.nextInt();
            if (i % 4 == 0 && i > maxDiv4) {
                maxDiv4 = i;
            }
            num--;
        }

        System.out.println(maxDiv4);
    }
}