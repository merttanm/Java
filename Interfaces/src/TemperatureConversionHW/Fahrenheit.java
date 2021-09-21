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
public class Fahrenheit implements Conversion{

    @Override
    public int conversion(Double inputConversion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void fahrenheitToKelvin(Double fahrenheitToKelvin) {
        double fahrenheitToKelvinOutput = fahrenheitToKelvin - 255;
        System.out.println("Fahrenheit to Kelvin: " + fahrenheitToKelvinOutput);

    }

    public void fahrenheitToCelcius(Double fahrenheitToCelcius) {
        double fahrenheitToCelciusOutput = fahrenheitToCelcius * 1.8 -32;
        System.out.println("Fahrenheit to Celcius: " + fahrenheitToCelciusOutput);

    }
   

 
   
}
