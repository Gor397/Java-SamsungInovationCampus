public class Person {
    private String name;
    private int age;
    private char gender; // m/f
    Person() { //1
        this(0, "", '-'); // -> 4
    }
    Person(int age) { //2
        this(age, "", '-'); // -> 4
    }
    Person(int age, String name) { //3
        this.age = age;
        this.name = name;
    }
    Person(int age, String name, char gender) { //4
        this(age, name); // -> 3 / this()must be the first statement
        this.gender = gender;
    }

    public static void main(String[] args) {
        Person person = new Person();
    }
}
