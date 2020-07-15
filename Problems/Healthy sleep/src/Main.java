import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int fact = scanner.nextInt();

        System.out.println(fact < min ? "Deficiency" :
                                                        fact > max ? "Excess" : "Normal");
    }
}
