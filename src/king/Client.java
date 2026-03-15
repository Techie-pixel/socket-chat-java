package king;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 20074)) {
            System.out.println("Connected to server!");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            output.println(num1);
            output.println(num2);

            // Loop for multiple operations
            while (true) {
                String signal = input.readLine();
                if (signal == null) break;

                System.out.println("\n--- MENU ---");
                System.out.println("1 -> Odd/Even check");
                System.out.println("2 -> Positive/Negative check");
                System.out.println("3 -> Square of two numbers");
                System.out.println("4 -> Disconnect");
                System.out.print("Your choice: ");
                int choice = scanner.nextInt();
                output.println(choice);

                String result = input.readLine();
                System.out.println("Server result: " + result);

                if (choice == 4) break;
            }

            scanner.close();
            System.out.println("Program ended.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}