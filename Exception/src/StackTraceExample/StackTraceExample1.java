/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackTraceExample;

/**
 *
 * @author merttan
 */
public class StackTraceExample1 {

    public static void main(String... args) throws Throwable {

        StackTraceExample1 stx = new StackTraceExample1();
        stx.doIt();

        /*
        try {
            stx.doIt();
        } catch (Throwable e) {
            System.out.println("asd");
        }
         */
    }

    public static void doIt() throws Throwable {
        try {
            Throwable tr = new Throwable();

          //  printStactTrace(tr);
            throw tr;
        } catch (Throwable e) {
            System.out.println("Doğrudan buraya giriyor");
        }
    }

    public static void printStactTrace(Throwable throwable) {
        System.out.println("----- Steak Throwable -----");
        StackTraceElement[] element = throwable.getStackTrace();
        for (StackTraceElement trace : element) {
            System.out.println("Class name:     " + trace.getClassName());
            System.out.println("File name:      " + trace.getFileName());
            System.out.println("Module name:    " + trace.getModuleName());
            System.out.println("Method name:    " + trace.getMethodName());
            System.out.println("Module version: " + trace.getModuleVersion());
            System.out.println("Line number:    " + trace.getLineNumber());
            System.out.println();
        }
     
    }

}
