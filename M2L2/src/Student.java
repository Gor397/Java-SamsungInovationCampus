public class Student extends Person1 {
    int rating;

    Student() {
        super(15);
        System.out.println("In Student() constructor");
    }

    public static void main(String[] args) {
        Student student = new Student();
    }
}
