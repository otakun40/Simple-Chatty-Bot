import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int mult = nums[i] * nums[i + 1];
            if (temp < mult) {
                temp = mult;
            }
        }
        System.out.println(temp);
    }
}