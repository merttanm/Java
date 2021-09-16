/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory2;

/**
 *
 * @author merttan
 */
public class Secretary extends Employee{
    
    public Secretary(int no, int years, String name, String department) {
        super(no, years, name, department);
    }

    @Override
    public void work() {
        super.work(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  @Override
	public String toString() {
		return "Secretary no=" + no + ", name=" + name + ", year=" + years + ", department=" + department + "";
	}
    
    
    
}
