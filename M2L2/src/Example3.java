public class Example3 {
    public void printMe() {
        System.out.println("Object reference internally: " + this);
    }

    public static void main(String[] args) {
        Example3 object = new Example3();
        System.out.println("Object reference externally: " + object);
        object.printMe();
    }
}
