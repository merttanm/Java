/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package References;

/**
 *
 * @author MERT
 */
public class UserTest {
 
    public static void main(String args[]) {
        
        UserModel user1= new UserModel();
        user1.adi="Pelin";
        user1.soyadi="Demir";
        user1.no=12;
        System.out.println(user1.bilgileri() );
        
        UserModel user2= new UserModel();
        user2.adi="Aylin";
        user2.soyadi="Gül";
        user2.no=13;
        System.out.println(user2.bilgileri() );
        
        System.out.println("---------------------------");
        UserModel tmp=user1;
        user1=user2;
        user2=tmp;
        System.out.println(user1.bilgileri());
        System.out.println(user2.bilgileri());
        /*
        user2=null;
        System.out.println(user2.bilgileri());
       
        */
        
    }
}
