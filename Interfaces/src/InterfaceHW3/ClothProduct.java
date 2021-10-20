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
public class ClothProduct extends LocationConnect {

    private String sex;
    private String size;

    public ClothProduct(String sku, double price, double tax, String description) {
        super(sku, price, tax, description);
    }

    public ClothProduct(String place, String depot, String sku, double price, double tax, String description) {
        super(place, depot, sku, price, tax, description);
    }

    @Override
    public void location() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
