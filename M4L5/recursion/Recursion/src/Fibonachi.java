public class Fibonachi {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonachi(i));
        }
    }

    private static int fibonachi(int i) {
        if (i == 0 || i == 1) {
            return i;
        }
        return fibonachi(i-1) + fibonachi(i-2);
    }
}
