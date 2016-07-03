package Sockets;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;
import java.io.PrintStream;

/**
 * Server
 * @author Dan
 * This demonstration will accept a user ID as a login, then prompt for password.
 * If they match, the server will return a success / welcome message.
 * If they do not match, the server will deny access, and return to a login prompt.
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Initialize variables
        int clientID    = 0;                      // empty ID to initialize
        String clientPassword = "";               // empty string to initialize
        int[] id        = new int[] {48652, 86495, 48521, 49632, 15296}; // users
        String password = "secret";               // all users have a default password
        ServerSocket ss = new ServerSocket(5685); // server socket (ss)
        Socket cs       = ss.accept();            // client socket (cs)
        Scanner sc      = new Scanner(cs.getInputStream());
        boolean success = false;                  // assume an unauthorized attempt
      
        // get ID from client
        clientID = sc.nextInt();
        
        // check clientID against server ids
        for (int i = 0; i < 5; i++) {
            if (clientID == id[i]) {
                success = true;
                break;
            }       
        }
        // Return login success flag (true | false)
        PrintStream p = new PrintStream(cs.getOutputStream());
        p.println(success);
        
        // Reset success flag
        success = false;
        // At this point, the ID is valid. Get password from client.
        clientPassword = sc.next();
        
        // check clientPassword against server password (password)
        if (clientPassword.equals(password)) 
            success = true;  
        
        // Return password success flag (true | false)
        p.println(success);
    }
    
     
}
