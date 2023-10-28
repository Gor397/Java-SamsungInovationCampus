public class Wrappers {
    static Byte byte1;
    static byte aByte;
    public static void main(String[] args) {
        aByte = 11;
        byte1 = Byte.valueOf(aByte);

    }
}
