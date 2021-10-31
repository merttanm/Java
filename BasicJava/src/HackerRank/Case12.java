/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author merttan
 */
public class Case12 {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static String findDay(int month, int day, int year) {
        /**
         * Duration findOfDay = Duration.ofDays(day); // *NOT* calendar days.
         * Duration findOfMonth = Duration.of(month, unit); Duration findOfYear
         * = Duration.ofDays(day); Instant now = Instant.now(); // Capture
         * current moment in UTC. Instant later = now.minus(findOfDay);
         * System.out.println(later+" \n"+ findOfDay);  P1Y10M26D
         */
        LocalDate startDate = LocalDate.of(2015, 2, 20);
        LocalDate endDate = LocalDate.of(2018, 1, 15);

        Period period = Period.between(startDate, endDate);
        System.out.println(period);
        return null;

    }

    public static void main(String[] args) {
        findDay(2, 32, 1995);
    }

}
