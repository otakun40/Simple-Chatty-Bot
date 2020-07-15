import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        boolean isOrder = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) <= 0) {
                isOrder = true;
            }   else {
                isOrder = false;
            }
        }
        System.out.println(isOrder);
    }
}
