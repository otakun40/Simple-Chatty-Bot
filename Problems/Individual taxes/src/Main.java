import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int company = scanner.nextInt();
        int[] profit = new int[company];
        int[] tax = new int[company];

        for (int i = 0; i < company; i++) {
            profit[i] = scanner.nextInt();
        }

        for (int i = 0; i < company; i++) {
            tax[i] = scanner.nextInt();
        }

        double greaterTax = 0;
        int count = 0;
        for (int i = 0; i < company; i++) {
            double currenttax = (double) profit[i] * (double) tax[i];
            if (greaterTax < currenttax) {
                greaterTax = currenttax;
                count = i + 1;
            }
        }
        System.out.println(count);
    }
}