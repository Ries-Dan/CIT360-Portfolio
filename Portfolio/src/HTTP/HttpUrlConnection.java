package HTTP;

import java.io.*;
import java.net.*;

/**
 * HttpUrlConnection
 * @author Dan
 * This demo will load a website into a string, which we can then search through
 * to find a keyword. This will enable the user to identify these keywords or
 * phrases without having to navigate to each website.
 */
public class HttpUrlConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Initialize variable
        URL url = new URL("http://www.google.com");
        
        // Open our connection and buffer
        URLConnection connection = url.openConnection();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        
        // The buffer will write to a string
        StringBuilder content = new StringBuilder();
        String input;
        while ((input = buffer.readLine()) != null)
            content.append(input + "\n");
        
        // Close the buffer and turn content into a String
        buffer.close();
        content.toString();
        
        
        // Display the result
        System.out.println(content);
        
        // Search the content for a keyword, character, or phrase
        String search = "Google has many";
        int result = content.indexOf(search);
        
        // Display results
        if (result != -1) {
            System.out.println("There are " + result + " occurences of " + 
                search + " in " + url.toString());
        }
        else
            System.out.println("There are no occurences of " + search + " in " + 
                    url.toString());    
    }
}
