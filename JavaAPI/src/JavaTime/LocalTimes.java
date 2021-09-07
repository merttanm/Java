/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTime;
import java.time.LocalTime;

/**
 *
 * @author merttan
 */
public class LocalTimes {
    
    public static void main(String[] args) throws InterruptedException {
        
       LocalTime time= LocalTime.now();
       System.out.println("Zaman: "+ time);
       System.out.println("Saat: "+ time.getHour());
       System.out.println("Dakika: "+ time.getMinute()); 
       System.out.println("Saniye: "+ time.getSecond());
       System.out.println("Nanosaniye: "+ time.getNano());
       
       Thread.sleep(4000);
       LocalTime time2= LocalTime.now();
       System.out.println("4 saniye sonra " +time2);
       
       
        
    }
    
}
