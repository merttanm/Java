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
public class Kelvin implements Conversion {

    @Override
    public int conversion(Double inputConversion) {

        kelvinToCelcius(inputConversion);
        kelvinToFahrenheit(inputConversion);
        return 0;
    }

    public void kelvinToCelcius(Double kelvinToCelcius) {
        double kelvinToCelciusOutput = kelvinToCelcius - 273;
        System.out.println("Kelvin to Celcius :" + kelvinToCelciusOutput);

    }

    public void kelvinToFahrenheit(Double kelvinToFahrenheit) {
        double kelvinToFahrenheitOutput = (kelvinToFahrenheit * 1.8 - 459);
        System.out.println("Kelvin to Fahrenheit :" + kelvinToFahrenheitOutput);

    }

}
