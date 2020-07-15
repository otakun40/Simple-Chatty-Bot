//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner name = new Scanner(System.in);
        String[] guests = new String[8];
        for (int i = 0; i < guests.length; i++) {
            guests[i] = name.next();
        }
        for (int i = guests.length - 1; i > -1; i--) {
            System.out.println(guests[i]);
        }
    }
}
