package JUNIT;

/**
 * JUNIT
 * This demo will use the Service class and test whether a potential client can afford
 * service by using JUNIT tests.
 * @author Dan
 */
public class JUNIT {

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
        
        // Client has money for services
        double cMoney = 159.67;
        
        // Assume client needs a new PC setup and a new network setup
        double quote = service[0].getPrice() + service[1].getPrice();
        
        // Can the client afford the service quote?
        if (compPrice(cMoney, quote)) {
            System.out.println("Let's get you set up!");
        }
        else
            System.out.println("Not enough cash, stranger!");
    }
    
    /** 
     * compPrice
     * Compares client budget to service cost
     * Input cPrice, sPrice
     * Output: cPrice >= sPrice (true | false)
     */ 
    public static boolean compPrice(double cPrice, double sPrice) {
        return cPrice >= sPrice;
    }
}
