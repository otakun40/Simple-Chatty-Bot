import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int triples = 0;

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 2] - array[i + 1] == 1 && array[i + 1] - array[i] == 1) {
                triples++;
            }
        }

        System.out.println(triples);
    }
}
