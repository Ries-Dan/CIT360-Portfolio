/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Dan
 */
public class ServiceController {
    private Service service;
    private ServiceView view;
    
    public ServiceController(Service service, ServiceView view) {
        this.service = service;
        this.view  = view;
    }
    
    public void setServiceName(String name) {
        service.setName(name);
    }
    
    public String getServiceName(String name) {
        return service.getName();
    }
       
    public void setServiceSku(int sku ) {
        service.setSku(sku);
    }
    
    public int getServiceSku() {
        return service.getSku();
    }
    
    public void setServicePrice(double price ) {
        service.setPrice(price);
    }
    
    public double getServicePrice() {
        return service.getPrice();
    }
    
    public void setTimeToComplete(int time) {
        service.setTimeToComplete(time);
    }
    
    public int getTimeToComplete() {
        return service.getTimeToComplete();
    }
    
    public void setActive(boolean active) {
        service.setActive(active);
    }
    
    public boolean isActive() {
        return service.isActive();
    }
    
    public void updateView() {
        view.displayServiceDetails(service.getSku(), service.getName(), service.getPrice(), service.getTimeToComplete(), service.isActive());
    }
}
