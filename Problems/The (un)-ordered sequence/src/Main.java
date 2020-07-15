import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orderAsc = 1;
        int orderDes = 1;
        int seq = scanner.nextInt();
        int valueSeq = 1;
        int i;

        while ((i = scanner.nextInt()) != 0) {
            if (i > seq) {
                orderAsc++;
            } else if (i < seq) {
                orderDes++;
            }   else if(i == seq) {
                orderAsc++;
                orderDes++;
            }
            seq = i;
            valueSeq++;
        }

        if (orderAsc == valueSeq || orderDes == valueSeq) {
            System.out.println(true);
        }   else {
            System.out.println(false);
        }
    }
}