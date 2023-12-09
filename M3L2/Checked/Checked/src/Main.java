import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        File current_dir = new File(System.getProperty("user.dir"));
        System.out.println("Current dir path: " + current_dir.getAbsolutePath());
        try {
            readFile("myFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No such file");
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine() `);
        }
//        FileReader reader = new FileReader(fileName);
    }
}