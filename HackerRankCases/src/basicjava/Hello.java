/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author MERT
 */
public class Hello {
/*
    public String selamSoyle(String isim) {
        return "Selam " + isim + " :)";
    }
*/
    String word="millet";
    public String selamSoyle(String kime){
    String cumle;
    
    if(kime!=""){
        cumle="selam " + kime + ":)";
    }
    else
        cumle="selam "+ word + ":)";
        return cumle;
    }
    
    
}
