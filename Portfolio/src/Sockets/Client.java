package Sockets;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;

/**
 * Client
 * @author Dan
 * This demonstration will accept a user ID as a login, then prompt for password.
 * If they match, the server will return a success / welcome message.
 * If they do not match, the server will deny access, and return to a login prompt.
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Initialize variables
        int id = 0;                         // initialize with 0
        boolean success   = true;           // server-returned indicator
        String password   = new String(""); // initialize with empty string
        Socket connection = new Socket("localhost",5685);
        Scanner input     = new Scanner(System.in);
        Scanner server    = new Scanner(connection.getInputStream());
        
        // Prompt user to log in with ID
        // For demonstration purposes, use ID 49632
        System.out.println("Employee ID: ");
        
        // Get input
        id = input.nextInt();
        
        // Send input to server
        PrintStream p = new PrintStream(connection.getOutputStream());
        p.println(id);
        
        // Get result from server
        success = server.nextBoolean();
        
        // If unauthorized, terminate connection
        if (!success){
            System.out.println("Unauthorized access. Terminating connection.");
            System.exit(0);
        }
        
        // ID is valid. Proceed with password
        System.out.println("Password: ");
        password = input.next();
        
        // Sent input to server
        p.println(password);
        
        // Get result from server
        success = server.nextBoolean();
        if (!success){
            System.out.println("Unauthorized access. Terminating connection.");
            System.exit(0);
        }
        else
            System.out.println("Welcome employee " + id + "!");
    }   
}
