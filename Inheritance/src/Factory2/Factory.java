/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory2;

/**
 *
 * @author MERT
 */
public class Factory {

    protected static String production;
    protected static String marketing;

    public Factory(String production, String marketing) {
        this.production = production;
        this.marketing = marketing;

        System.out.println("Factory is creating...");
    }
    
    
    public static void getInfo() {

        System.out.println("Production Department: " + production);
        System.out.println("Marketing Department: " + marketing);

    }


}
