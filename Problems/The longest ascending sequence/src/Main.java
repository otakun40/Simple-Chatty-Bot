import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int[] arrayCopy = new int[array.length];
        Arrays.fill(arrayCopy, 1);

        int currentSequence = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                currentSequence++;
                arrayCopy[i] = currentSequence;
            }   else if (array[i] > array[i + 1]) {
                arrayCopy[i] = currentSequence;
                currentSequence = 1;
            }
        }
        Arrays.sort(arrayCopy);
        System.out.println(arrayCopy[arrayCopy.length - 1]);
    }
}