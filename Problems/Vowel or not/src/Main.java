import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        System.out.println(gcd(6,2));











    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}