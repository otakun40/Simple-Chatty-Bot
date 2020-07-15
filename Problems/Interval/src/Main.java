import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean interval1 = num > -15 && num <= 12;
        boolean interval2 = num > 14 && num < 17;
        boolean interval3 = num >= 19;

        System.out.println(interval1 || interval2 || interval3 ? "True" : "False");
    }
}
