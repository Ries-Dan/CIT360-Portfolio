package Collections;
import java.util.*;

/**
 * Java Collections: Map
 * @author Dan
 * This demonstration will cover hash, linkedHash, and tree maps.
 * It will also iterate through them for display, add, and remove data.
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize variables
        // non-order
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // ordered
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        // natural order by key
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
    
        // Populate the map with user ids and passwords
        populateMap(treeMap);
        
        // Display the map in its type order
        displayMap(treeMap);
        
        // Add a user
        addUser(treeMap, 58962, "3E5he&");
        
        // Display the map in its type order
        displayMap(treeMap);
        
        // Remove a user
        removeUser(treeMap, 49632);
        
        // Display the map in its type order
        displayMap(treeMap);
        
        // Replace user password with a new one
        changePassword(treeMap, 86495, "password123");
        
        // Display the map in its type order
        displayMap(treeMap);
    }
    /*
     * populateMap
     * Contains userIDs and their passwords.
     * Input map key: ID | string: password
     * Any map type can be used (Hash, Linked, Tree)
     */
    public static void populateMap(Map<Integer, String> map) {
        map.put(48652, "secret");
        map.put(86495, "password");
        map.put(48521, "DrDNA");
        map.put(49632, "iliketurtles");
        map.put(15296, "Gopher42");
    }
    
    /*
     * displayMap
     * Iterates through a map and displays their contents
     * Input: map
     */
    public static void displayMap(Map<Integer, String> map) {
        for (Integer key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
        System.out.println("\nThere are " + map.size() + "current users");
    }
    
    /*
     * addUser
     * Adds a user and their password to the map of users
     * Input: map |userID | password
     */
    public static void addUser(Map<Integer, String> map, int id, String password) {
        map.put(id, password);
    }
    
    /*
     * removeUser
     * Removes a user from the map of users
     * Input: map |userID
     */
    public static void removeUser(Map<Integer, String> map, int id) {
        map.remove(id);
    }
    
    /*
     * changePassword
     * Replaces a user's old password with a new one
     * Input: map |userID | password
     */
    public static void changePassword(Map<Integer, String> map, int id, String newPass) {
        map.replace(id, newPass);
    }
}