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
public interface Conversion {

    public int conversion(Double inputConversion);
    
    /*
    default interface yöntemidir; implementation  ve body olmak zorundadır override etmek zorunluluğu yoltur */
    default void sss(){}
    
    
}
