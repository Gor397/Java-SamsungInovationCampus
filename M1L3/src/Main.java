import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int length = (int) (Math.round(Math.log10(n)+1));
        int smallest = n % 10;
        for (int i = 1; i <= length; i++) {
            int digit = (int) (n % (Math.pow(10, i)) / Math.pow(10, (i - 1)));
            if (smallest == 0 && digit != 0) {
                smallest = digit;
            } else if (digit < smallest && digit != 0) {
                smallest = digit;
            }
        }

        System.out.println(smallest);
    }
}
