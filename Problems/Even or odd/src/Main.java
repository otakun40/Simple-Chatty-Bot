import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sequence;

        do {
            sequence = scanner.nextInt();
            if (sequence == 0) {
                break;
            }
            System.out.println(sequence % 2 == 0 ? "even" : "odd");
        } while (sequence != 0);
    }
}
