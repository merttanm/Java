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
public class Employee implements Worker , Comparable {

    int no;
    int years;
    String name;
    String department;

    public static final int BASE_SALARY = 1000;

    @Override
    public void work() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Employee(int no, int years, String name, String department) {
        this.no = no;
        this.years = years;
        this.name = name;
        this.department = department;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    
    @Override
    public int compareTo(Object o) {
      if(o instanceof Employee e) {
			return name.compareTo(e.getName());
		}
		return 0;/*
                        if(no < e.no)
				return -1;
			else if(no == e.no)
				return 0;
			else
				return 1;
		}
		return 0;*/
	}

  @Override
	public String toString() {
		return "Employee no=" + no + ", name=" + name + ", year=" + years + ", department=" + department + "";
	}
    

    public double calculateSalary() {
        return years * BASE_SALARY;
    }
    
    
    

}
