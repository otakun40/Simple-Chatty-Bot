import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int flyTicket = scanner.nextInt();
        int hotelByNight = scanner.nextInt();

        System.out.println(foodPerDay * days + flyTicket * 2 + hotelByNight * (days - 1));
    }
}