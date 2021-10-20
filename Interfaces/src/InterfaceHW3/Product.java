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
abstract class Product {

    private String sku;
    private double price;
    private double tax;
    private String description;

    public Product(String sku, double price, double tax, String description) {
        this.sku = sku;
        this.price = price;
        this.tax = tax;
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void purchase() {
    }

}
