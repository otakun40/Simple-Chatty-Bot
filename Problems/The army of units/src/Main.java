import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int units = new Scanner(System.in).nextInt();

        if (units < 1) {
            System.out.println("no army");
        } else if (units > 0 && units < 20) {
            System.out.println("pack");
        } else if (units > 19 && units < 250) {
            System.out.println("throng");
        } else if (units > 249 && units < 1000) {
            System.out.println("zounds");
        } else if (units > 999) {
            System.out.println("legion");
        }
    }
}
