/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author MERT
 */
public class Employee {

    String firstname, lastname, depertment;
    int salary;

    static class Builder {

        String firstname, lastname, depertment;
        int salary;

        public Builder firstname(String firstname){
        this.firstname=firstname;
        return this;
        }
        
        public Builder lastname(String lastname){
        this.lastname=lastname;
        return this;
        }
        
        public Builder depertment(String depertment){
        this.depertment=depertment;
        return this;
        }
        
        public Builder salary(Integer salary){
        this.salary=salary;
        return this;
        }
        
        
    }

}
