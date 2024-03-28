// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(power(5, 2));
        rCycle(1,6);
    }

    private static double power(int i, int i1) {
        if (i1 == 1) {
            return i;
        }
        return power(i * i, i1 - 1);
    }

    private static double factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return factorial(x-1) * x;
    }

    private static void cycle(int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.println(i);
        }
    }

    private static int rCycle(int start, int end) {
        if (start == end) {
            return start;
        }
        int k = end - start;
        System.out.println(end - k);
        return rCycle(start + 1, end);
    }
}