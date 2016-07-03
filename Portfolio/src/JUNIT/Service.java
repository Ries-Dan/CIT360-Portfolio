package JUNIT;
import java.io.Serializable;

/*
 * @author Dan
 * This class contains a list of sample services for a PC repair company
 * variables
 * name           - String
 * price          - Double
 * timeToComplete - int
 * active         - boolean
 */
public class Service implements Serializable {

    //Constructor
    public Service(int sku, String name, double price, int timeToComplete, boolean active) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.timeToComplete = timeToComplete;
        this.active = active;
    }
    
    //Variables
    private int     sku;
    private String  name;
    private double  price;
    private int     timeToComplete;
    private boolean active;
    
    //Getters & Setters
    public int getSku() {
        return sku;
    }
    
    public void setSku() {
        this.sku = sku;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTimeToComplete() {
        return timeToComplete;
    }

    public void setTimeToComplete(int timeToComplete) {
        this.timeToComplete = timeToComplete;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }   
}
