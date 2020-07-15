import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double sumOfDiv3 = 0;
        double divider = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0) {
                sumOfDiv3 += i;
                divider++;
            }
        }
        double average = sumOfDiv3 / divider;
        System.out.println(average);
    }
}
