package king;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(20074)) {
            System.out.println("Server is running and waiting for a client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            int num1 = Integer.parseInt(input.readLine());
            int num2 = Integer.parseInt(input.readLine());
            System.out.println("Numbers received: " + num1 + ", " + num2);

            while (true) {
                output.println("MENU");

                String choiceLine = input.readLine();
                if (choiceLine == null) break;

                int choice = Integer.parseInt(choiceLine);
                String result = "";

                switch (choice) {
                    case 1:
                        result = "First: " + (num1 % 2 == 0 ? "Even" : "Odd")
                               + ", Second: " + (num2 % 2 == 0 ? "Even" : "Odd");
                        break;
                    case 2:
                        result = "First: " + (num1 >= 0 ? "Positive" : "Negative")
                               + ", Second: " + (num2 >= 0 ? "Positive" : "Negative");
                        break;
                    case 3:
                        result = "Square of first: " + (num1 * num1)
                               + ", Square of second: " + (num2 * num2);
                        break;
                    case 4:
                        result = "Disconnected. Goodbye!";
                        output.println(result);
                        System.out.println("Client disconnected.");
                        socket.close();
                        return;
                    default:
                        result = "Invalid choice!";
                }

                output.println(result);
                System.out.println("Sent: " + result);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}