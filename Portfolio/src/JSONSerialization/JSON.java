// package imports
package JSONSerialization;

import com.google.gson.Gson;

/**
 * JSON Serialization demo
 * JavaScript Object Notation
 * @author Dan
 * This demo will create multiple objects, and convert them to JSON
 */
public class JSON {

    public static void main(String[] args) {
        
        System.out.println("This demonstration will take an array of services, and serialize"
                + "them to JSON.\n");
        
        // Create array of services
        // sku, name, price, timeToComplete, active
        int numServices = 6;
        Service[] service = new Service[numServices];
        service[0] = new Service(4856923,"PC Setup",99.99,60,true);
        service[1] = new Service(4758123,"New Network Setup",99.99,60,true);
        service[2] = new Service(8962586,"PC Diagnostic",99.99,60,true);
        service[3] = new Service(4256981,"PC Repair",99.99,90,true);
        service[4] = new Service(1985632,"Operating System Install",149.99,120,true);
        service[5] = new Service(2006598,"Member Support",49.99,90,false);
        
        // Display a service to verify functionality
        System.out.println("Sample services in the service array");
        display(service[0]);
        display(service[5]);
        
        // Serialize data
        // Create Gson object
        Gson serviceGson = new Gson();
        
        // Create the JSON string
        String[] services = new String[numServices];
        
        // Serialize object via for loop (toJson)
        for (int i = 0; i < numServices; i++) {
            services[i] = serviceGson.toJson(service[i]);
        }

        // Display the JSON notation using for loop
        System.out.println("\nSerialized data\n");
        for (int i = 0; i < numServices; i++ ) {
            System.out.println(services[i]);
        }
        
        // Deserialize data
        // Create new Service object
        Service[] newService = new Service[numServices];
        
        System.out.println("\nNow the data will be deserialized\n");
        // Deserialize Json to object (fromJson) via for loop
        for (int i = 0; i < numServices; i++) {
            newService[i] = serviceGson.fromJson(services[i], Service.class);
        }
        
        // Display object data via display() function
        display(newService[0]);
        display(newService[5]);
    }
    
    // Displays the service object
    public static void display(Service service) {
        System.out.println(service.getName() + " costs $" + service.getPrice() + " and is expected "
                + "to take " + service.getTimeToComplete() + " minutes to complete.");
    }
}