import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        File fl = new File("./example.txt");
        System.out.println ("File name: " + fl .getName());
        System.out.println ("Path: " + fl.getPath());
        System.out.println ("Full path: " + fl.getAbsolutePath());
        System.out.println ("Parent directory: " + fl.getParent());
        System.out.println ("File exists: " + (fl.exists() ? "yes" : "no"));
        System.out.println ("Writable: " + (fl.canWrite() ? "yes" : "no"));
        System.out.println ("Readable: " + (fl.canRead() ? "yes" : "no"));
        System.out.println ("Is Directory: " + (fl.isDirectory() ? "yes": "no"));
        System.out.println ("File length:" + fl.length() + " Bytes");

        System.out.println ("Last modification:" + fl.lastModified());
        Instant instant = Instant.ofEpochMilli(fl.lastModified());
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println("Last modification:" + localDateTime);
    }
}