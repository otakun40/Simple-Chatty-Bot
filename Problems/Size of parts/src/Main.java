import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parts = scanner.nextInt();
        int[] size = new int[parts];

        int good = 0;
        int fix = 0;
        int bad = 0;

        for (int i = 0; i < parts; i++) {
            size[i] = scanner.nextInt();
            if (size[i] == 0) {
                good++;
            }   else if (size[i] == 1) {
                fix++;
            }   else if (size[i] == -1) {
                bad++;
            }
        }

        System.out.println(good + " " + fix + " " + bad);
    }
}
