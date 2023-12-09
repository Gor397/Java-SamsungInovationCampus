import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
       try{
          NullPointerException exception = new NullPointerException("Null pointer");
          throw exception;
       }catch (NullPointerException e){
           System.out.println(e.getMessage());
       }finally {
           System.out.println("Cleanup");

       }

        System.out.println("Hello!");

    }

}