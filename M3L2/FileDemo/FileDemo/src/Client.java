import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Connect to server on localhost and port 12345

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            output.println("Hello from client"); // Send message to server

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverMessage = input.readLine(); // Read message from server
            System.out.println("Server says: " + serverMessage);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
