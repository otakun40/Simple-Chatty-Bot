import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] digits = new int[3];

        for (int i = 0; i < 3; i++) {   //split number on digits
            digits[i] = number % 10;
            number /= 10;
        }

        int result = 0;

        for (int y = 0, x = digits.length - 1; y < digits.length; x--, y++) {   //reverse number
            result += digits[y] * (int) Math.pow(10.0, x);
        }
        System.out.println(result);

    }
}
