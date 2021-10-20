/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceHW3;

/**
 *
 * @author merttan
 */
abstract class LocationConnect extends Product implements Location{
    
    private String place;
    private String depot;

    public LocationConnect(String sku, double price, double tax, String description) {
        super(sku, price, tax, description);
    }

    public LocationConnect(String place, String depot, String sku, double price, double tax, String description) {
        super(sku, price, tax, description);
        this.place = place;
        this.depot = depot;
    }

    @Override
    public void purchase() {
        super.purchase(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescription() {
        return super.getDescription(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTax(double tax) {
        super.setTax(tax); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTax() {
        return super.getTax(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSku(String sku) {
        super.setSku(sku); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSku() {
        return super.getSku(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public abstract void location();
   
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }
    
    

}
