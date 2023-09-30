import java.util.Scanner;

public class Main {
//    public static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] a = new int[n][m];
        for (int k = 0; k < n * m; ++k) {
            int i = k / m;
            int j = k % m;
            a[i][j] = i * j;
            System.out.printf("%4d%s", a[i][j], j==m - 1 ? "\n" : "");
        }
    }
}