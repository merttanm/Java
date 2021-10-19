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
public class AccountClient {

    private double toAdd;
    private double tosubtracter;
    double globalmoney;

    public void withdrawMoney(Account ds, double sub) {
        //   System.out.println("Money: " + ds.money);
        ds.money = ds.money - sub;
        System.out.println("money witraw in your account new money: " + ds.money);
        if (ds.balance <= 0) {
            System.out.println("dropped to negative balance");
        }

    }

    public void toDepositMoney(Account ds, double add) {
        //       System.out.println("Money: " + ds.money);
        ds.money = ds.money + add;
        System.out.println("money deposited in your account new money: " + ds.money);
        if (ds.balance > 1000) {
            System.out.println("Congratulations, you have entered the special customer class");
        }
    }

}
