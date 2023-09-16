public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("-------------");
        int xx = 0b1111;
        System.out.println(Integer.toString(xx, 2));
        System.out.println(Integer.toString(xx, 3));
        System.out.println(Integer.toString(xx, 16));

        System.out.println("-------------");
        int xx1 = 0x1A;
        System.out.println(Integer.toString(xx1, 2));
        System.out.println(Integer.toString(xx1, 3));
        System.out.println(Integer.toString(xx1, 16));

        System.out.println("-------------");
        int xx2 = 0x1A;
        System.out.println(Integer.toString(xx2, 2));
        System.out.println(Integer.toString(xx2, 3));
        System.out.println(Integer.toString(xx2, 16));

        System.out.println("-------------");
        int num = 5;
        int sh = 2;
        int result = num << sh;
        System.out.println("result = " + result);

        System.out.println("-------------");
        int num1 = 100;
        int sh1 = 2;
        int result1 = num1 >> sh1;
        System.out.println("result = " + result1);
    }
}