public class Example {
    public void print() { // option 1
        System.out.println("Default print");
    }
    public void print(int index) { // option 2
        System.out.println("Index is " + index);
    }
    public void print(double coefficient) { // option 3
        System.out.println("Coefficient is " + coefficient);
    }
    public void print(int index, double coefficient) { // option 4
        System.out.printf("Index: %d, coefficient: %f", index, coefficient);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.print(); //option 1
        obj.print(2); //option 2
        obj.print(4.5); //option 3
        obj.print(3, 5.4); //option 4
    }
}
