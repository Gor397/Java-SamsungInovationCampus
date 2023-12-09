import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("aa.txt");
            FileWriter out = new FileWriter("bb.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File open error: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("File read/write error: " + e.getMessage());
        }
    }
}
