/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author merttan
 */
public class FormattedOutput {

    public static void main(String[] args) {
        System.out.print("Secuare Data: ");

        System.out.printf("%02d/%02d/%04d, %02d:%02d%n%n", 1, 2, 3, 4, 5);
        System.out.printf("%-20s%7s%9s%8s%n", "Item", "Price", "Quantity", "Amount");

        double quantity = 4;
        String str = "Ultra HD, 4TB";
        double price = 120.25;
        double amount = quantity * price;
        double total = amount;
        String itemFormat = "%-20s %7s %9s %8s %n";
        System.out.printf(itemFormat, str, price, quantity, amount);

        quantity = 2;
        price = 455.0;
        amount = quantity * price;
        total = total + amount;
        System.out.printf(itemFormat, str, price, quantity, amount);
        
     
    }

}
