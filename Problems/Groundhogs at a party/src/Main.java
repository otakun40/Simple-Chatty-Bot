import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cup = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        System.out.println(weekend ? cup >= 15 && cup <= 25 : cup >= 10 && cup <= 20);
    }
}
