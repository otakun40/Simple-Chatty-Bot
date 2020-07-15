//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        input.nextLine();
        input.nextLine();
        input.nextLine();
        String cuisine = input.nextLine();

        System.out.print("The form for " + firstName + " is completed. ");
        System.out.println("We will contact you if we need a chef that cooks " + cuisine + " dishes.");
    }
}
