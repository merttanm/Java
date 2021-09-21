/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperatureConversionHW;

/**
 *
 * @author merttan
 */
public class ConversionC implements Conversion {

    private int conversion;
    Celcius celcius = new Celcius();
    Kelvin kelvin = new Kelvin();
    Fahrenheit fahrenheit = new Fahrenheit();

    @Override
    public int conversion(Double inputConversion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String doSelected(String selected, Double d) {
        double result = 0;
        String s=null;
        if (selected.equals("Celcius")) {
            result = celcius.conversion(d);
            System.out.println(result);

        } else if (selected.equals("Fahrenheit")) {
            result = fahrenheit.conversion(d);
            System.out.println(result);
        } else {
            result = kelvin.conversion(d);
            System.out.println(result);
        }
        return s;

    }

}
