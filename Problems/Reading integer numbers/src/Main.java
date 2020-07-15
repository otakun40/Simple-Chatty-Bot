import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            numbers.add(input.nextInt());
        }
        input.close();

        for (int num: numbers) {
            System.out.println(num);
        }
    }
}
