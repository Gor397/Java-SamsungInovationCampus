import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= a; k++) {
                System.out.printf("%7d", i*k);
            }
            System.out.println();
        }
    }
}
