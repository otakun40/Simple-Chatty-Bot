import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] digits = new int[4];

        for (int i = 3; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        if (digits[0] == digits[3] && digits[1] == digits[2]) {
            System.out.println(1);
        }   else {
            System.out.println(56);
        }
    }
}
