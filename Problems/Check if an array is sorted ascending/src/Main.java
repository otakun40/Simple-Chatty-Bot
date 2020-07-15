import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long[] arrayLong = new Long[scanner.nextInt()];

        boolean isOrder = true;
        for (int i = 0; i < arrayLong.length; i++) {
            arrayLong[i] = scanner.nextLong();
        }

        if (arrayLong.length == 1) {
            isOrder = true;
        }   else {
            for (int i = 0; i < arrayLong.length - 1; i++) {
                if (arrayLong[i] > arrayLong[i + 1]) {
                    isOrder = false;
                    break;
                }
            }
        }
        System.out.println(isOrder);
    }
}
