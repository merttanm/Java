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
public class Employee extends Person{
    
    final int employeeId;

    public Employee(int employeeId, int id, String name, String surname, int TCKN) {
        super(id, name, surname, TCKN);
        this.employeeId = employeeId;
    }
        
  
    
}
