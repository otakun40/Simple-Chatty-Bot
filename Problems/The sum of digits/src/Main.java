import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfDigits = 0;

        while (number != 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }

        System.out.println(sumOfDigits);
    }
}