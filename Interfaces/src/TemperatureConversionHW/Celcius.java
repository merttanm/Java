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
public class Celcius implements Conversion {

    @Override
    public int conversion(Double inputConversion) {

        celciusToKelvin(inputConversion);
        celciusToFahrenheit(inputConversion);
        return 0;

    }

    public void celciusToKelvin(Double celciusToKelvin) {
        double celciusToKelvinOutput = celciusToKelvin + 273;
        System.out.println("Celcius to Kelvin :" + celciusToKelvinOutput);

    }

    public void celciusToFahrenheit(Double celciusToFahrenheit) {
        double celciusToFahrenheitOutput = celciusToFahrenheit/1.8 + 32;
        System.out.println("Celcius to Fahrenheit: " + celciusToFahrenheitOutput);

    }

}
