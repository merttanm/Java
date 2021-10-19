/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankEncapsulation;

/**
 *
 * @author merttan
 */
public class NewClass {

    public static AccountClient ac = new AccountClient();

    public static void main(String[] args) {
        Account a = new Account(11.0, 10.0);
        ac.withdrawMoney(a, 1.0);
        ac.toDepositMoney(a, 30);
        ac.toDepositMoney(a, 10);
        ac.toDepositMoney(a, 40);

    }
}
