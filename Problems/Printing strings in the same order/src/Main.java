import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String[] wordMassive = new String[4];

        for (int word = 0; word < 4; word++) {
            wordMassive[word] = input.next();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(wordMassive[i]);
        }
    }
}
