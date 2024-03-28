import java.util.Arrays;
import java.util.Comparator;

public class Teacher {
    int id;
    String name;
    int age;
    long salary;

    public Teacher(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static Comparator<Teacher> SalaryComparator = new Comparator<Teacher>() {
        @Override
        public int compare(Teacher o1, Teacher o2) {
            return (int) (o1.salary - o2.salary);
        }
    };

    public static Comparator<Teacher> AgeComparator = new Comparator<Teacher>() {
        @Override
        public int compare(Teacher o1, Teacher o2) {
            return (int) (o1.age - o2.age);
        }
    };

    public static Comparator<Teacher> NameComparator = new Comparator<Teacher>() {
        @Override
        public int compare(Teacher o1, Teacher o2) {
            return (o1.name.compareTo(o2.name));
        }
    };

    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[4];
        teachers[0] = new Teacher(10, "Mikey", 25, 10000);
        teachers[1] = new Teacher(2, "Arun", 29, 20000);
        teachers[2] = new Teacher(5, "Lisa", 35, 5000);
        teachers[3] = new Teacher(1, "Panka", 32, 60000);

        Arrays.sort(teachers, Teacher.SalaryComparator);
        System.out.println("Teachers list sorted by Salary:\n" + Arrays.toString(teachers));

        
        Arrays.sort(teachers, Teacher.AgeComparator);
        System.out.println("Teachers list sorted by Age:\n" + Arrays.toString(teachers));
    }

    public String toString() {
        return "[id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }
}
