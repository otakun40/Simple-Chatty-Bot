import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];

        int maxFirst = 0;
        int current = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] = scanner.nextInt()) > current) {
                maxFirst = i;
                current = array[i];
            }
        }

        System.out.println(maxFirst);
    }
}
