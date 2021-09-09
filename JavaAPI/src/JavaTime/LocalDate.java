/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTime;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author merttan
 */
public class LocalDate {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        LocalDateTime todayNow = LocalDateTime.now();
        System.out.println(todayNow);

        

    }

}
