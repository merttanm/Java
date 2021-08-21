/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package This;

/**
 *
 * @author MERT
 */
public class This {
	
	String name;
	double height;
	
	public This(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	public void printName() {
		System.out.println("Name: "+ this.name);
	}
	public void printHeigth() {
		System.out.println("Heigth: "+ this.height);
	}
	
	public void printInfo() {
		System.out.println("print info: ");
		this.printName();
		this.printHeigth();
		
	}
	
	
	
    
    public static void main(String[] args) {
     
    	This thisExample =new This("asd",2.3);
    	thisExample.printInfo();
    	
    	
    	
    }
    
}
