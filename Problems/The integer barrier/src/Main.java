import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        int result = 0;
        while (scanner.hasNext()) {
            num = scanner.nextInt();
            sum += num;
            if (sum >= 1000) {
                result = sum - 1000;
                break;
            }
            if (num == 0) {
                result = sum;
                break;
            }
        }
        System.out.println(result);
    }
}
