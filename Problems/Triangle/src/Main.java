import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var sideA = scanner.nextInt();
        var sideB = scanner.nextInt();
        var sideC = scanner.nextInt();

        System.out.println(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA ? "YES" : "NO");
    }
}
