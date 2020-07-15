import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        int bridgeHeight;

        for (int i = 1; i <= bridges; i++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
            if (i == bridges) {
                System.out.println("Will not crash");
            }
        }
    }
}
