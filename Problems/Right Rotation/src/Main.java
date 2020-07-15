import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        Scanner n = new Scanner(inputLine);
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (n.hasNext()) {
            arrayList.add(n.nextInt());
        }

        Integer[] array = arrayList.toArray(new Integer[arrayList.size()]);
        int rotation = scanner.nextInt();
        int[] resultArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int newPosition;
            if (rotation > array.length) {
                rotation %= array.length;
            }
            if (i + rotation > array.length - 1) {
                newPosition = i + rotation - array.length;
            }   else {
                newPosition = i + rotation;
            }
            resultArray[newPosition] = array[i];
        }
        for (int i: resultArray) {
            System.out.print(i + " ");
        }
    }
}
