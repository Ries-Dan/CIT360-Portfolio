package MVC;

/**
 * ServiceView
 * Responsible for displaying a service
 * @author Dan
 */
public class ServiceView {
    // Constructor
    public void displayServiceDetails(int sku, String name, double price, int time, boolean active) {
        System.out.println("SKU: "              + sku);
        System.out.println("Service Name: "     + name);
        System.out.println("Price: $"            + price);
        System.out.println("Time to Complete: " + time + " minutes");
        System.out.println("Active SKU: "       + active);
    }         
}
