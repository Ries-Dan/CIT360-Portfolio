package MVC;

/**
 * MVC Demo
 * Model, View, Controller
 * This demo will create a Services class, and demonstrate how to model, control, and
 * view its data.
 * @author Dan
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
        // Create view and controllers
        ServiceView view = new ServiceView();
        ServiceController control = new ServiceController(service[0], view);
        
        // View service[0] as it currently is
        control.updateView();
        
        // Update service cost and time to complete
        control.setServicePrice(149.99);
        control.setTimeToComplete(120);
        
        // View service[0] with the updated change
        System.out.println("\nNew Service Details:");
        control.updateView();
        
        // Set service[0] to inactive
        System.out.println("\nDeactivate service");
        control.setActive(false);
        
        // View service[0] with the updated change
        System.out.println("\nNew Service Details:");
        control.updateView();
    } 
}
