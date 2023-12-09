import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("a.txt");
            FileOutputStream out = new FileOutputStream("b.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }}
//        } catch (FileNotFoundException e) {
//            System.out.println("Stream open error: " + e.getMessage());
//        }
        catch (IOException e) {
            System.out.println("Stream read/write error: " + e.getMessage());
        }
    }
}
