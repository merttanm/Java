/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory1;

/**
 *
 * @author MERT
 */
public class Test {

    public static void main(String[] args) {

        Employee emp = new Employee(1, 14, "Muhammet", "Temizlik");
        emp.getInfo();
        Manager mng = new Manager(2, 31, "Hatçe", "İdari işler", "İdari");
        mng.getInfo();
        Director drc = new Director(3, 2, "Selim", "İdari işler", "İdari", 10000);
        drc.getInfo();

    }

}
