public class FuncParam {
    static void swap(int a, int b) {
        int temp = a;
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}
