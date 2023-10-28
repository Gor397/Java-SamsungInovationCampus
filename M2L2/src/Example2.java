public class Example2 {
    public void print(int index, long address) { // option 1
        System.out.println("Index: " + index + ", address: " + address);
    }
    public long print(long index, int address) { // option 2
        System.out.println("Address: " + index + ", index: " + address);
        return address + index;
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.print(2, 4); //ambiguity error
        obj.print(2, 4L);
    }
}
