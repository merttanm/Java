/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketsystem;

/**
 *
 * @author merttan
 */
public class Person {

    private final int id;
    private String name;
    private String surname;
    private  final  int TCKN;

    public Person(int id, String name, String surname, int TCKN) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.TCKN = TCKN;
    }

    public void getInfo() {

        String getInfo = "Adı:  " + name + "\nSoyadı:   " + surname + "\nTC Kimlik no:  " + TCKN + "\nKullanıcı ID: " + id;
        System.out.println(getInfo);

    }

}
