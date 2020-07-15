import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourFirst = scanner.nextInt();
        int minuteFirst = scanner.nextInt();
        int secondFirst = scanner.nextInt();
        int hourSecond = scanner.nextInt();
        int minuteSecond = scanner.nextInt();
        int secondSecond = scanner.nextInt();

        int firstTime = hourFirst * 3600 + minuteFirst * 60 + secondFirst;
        int secondTime = hourSecond * 3600 + minuteSecond * 60 + secondSecond;

        System.out.println(secondTime - firstTime);
    }
}
