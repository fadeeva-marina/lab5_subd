/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author ДНС
 */
public class ServicePrice {

    private long id;
    private String service;
    private double price;

    public ServicePrice() {
    }

    public ServicePrice(long id, String service, double price) {
        this.id = id;
        this.service = service;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return service + ", price=" + price;
    }

}
