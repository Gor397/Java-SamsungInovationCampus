
import java.io.*;
import java.net.*;

    public class Server {
        public static void main(String[] args) {
            try {
                ServerSocket serverSocket = new ServerSocket(12345); // Create a server socket on port 12345
                System.out.println("Server waiting for client on port 12345");

                Socket socket = serverSocket.accept(); // Wait for a client to connect
                System.out.println("Client connected");

                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String clientMessage = input.readLine(); // Read message from client
                System.out.println("Client says: " + clientMessage);

                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
                output.println("Hello from server"); // Send message to client

                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


