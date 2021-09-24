/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author merttan
 */
public class ExceptionExample1 {

    private static Scanner scanner;

    public static void main(String[] args) {

        String path = read("Dosya uzantısını giriniz");

        //openFile(path);
        openAndCloseFile(path);

    }

    public static void openFile(String path) {

        File openFile = new File(path);

        try {
            InputStream in = new FileInputStream(openFile);
            System.out.println("Open file");
            System.out.println("Close file");

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }

    }

    public static void openAndCloseFile(String path) {

        File openFile = new File(path);

        try {
            OutputStream out = new FileOutputStream(openFile);
            System.out.println("Open file");
            String s = "selamlar";
            byte[] bytes = s.getBytes("US-ASCII");
            out.write(bytes);
            out.close();
            System.out.println("Close file");

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }

    static {
        scanner = new Scanner(System.in);
    }

    public static String read(String prmp) {

        System.out.println(prmp);
        return scanner.next();
    }

}
