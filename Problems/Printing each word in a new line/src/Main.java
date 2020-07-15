import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String[] wordsArray = new String[5];

        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = input.next();
        }

        for(String word: wordsArray) {
            System.out.println(word);
        }
    }
}