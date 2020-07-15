import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int div6sum = 0;
        int input;
        int y = scanner.nextInt();
        for (int i = 0; i < y; i++) {
            input = scanner.nextInt();
            if (input % 6 == 0) {
                div6sum += input;
            }
        }
        System.out.println(div6sum);
    }
}