import java.util.Arrays;

public class Employee implements Comparable<Employee> {

    int id;
    String name;
    int age;
    long salary;

    @Override
    public int compareTo(Employee o) {
        return id - o.id;
    }

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee(10, "Mikey", 25, 10000);
        employees[1] = new Employee(2, "Arun", 29, 20000);
        employees[2] = new Employee(5, "Lisa", 35, 5000);
        employees[3] = new Employee(1, "Panka", 32, 60000);

        Arrays.sort(employees);
        System.out.println("Default Sorting of Employees list:\n" + Arrays.toString(employees));
    }
}
