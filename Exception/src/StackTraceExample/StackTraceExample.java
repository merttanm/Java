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
public class StackTraceExample {

    public static void main(String... args) {

        StackTraceExample stx = new StackTraceExample();
        stx.doIt();
    }

    public void doIt() {

        Throwable tr = new Throwable("Just Throwable");
        // tr.printStackTrace();
        // throw new OutOfMemoryError("----OutOfMemoryError-----");
        // System.out.println(tr);
        printStactTrace(tr);
    }

    public void printStactTrace(Throwable throwable) {
        System.out.println("----- Steak Throwable -----");
        //StackTraceElement[] element = new StackTraceElement[10];
        StackTraceElement[] element = throwable.getStackTrace();
        for (StackTraceElement trace : element) {
            System.out.println("Class name:     " + trace.getClassName());
            System.out.println("File name:      " + trace.getFileName());
            System.out.println("Module name:    " + trace.getModuleName());
            System.out.println("Method name:    " + trace.getMethodName());
            System.out.println("Module version: " + trace.getModuleVersion());
            System.out.println("Line number:    " + trace.getLineNumber());
        }
        System.out.println();
    }

}
