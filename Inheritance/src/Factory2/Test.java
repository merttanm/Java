/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory2;

/**
 *
 * @author MERT
 */
public class Test {
    public static void main(String[] args) {
        
        Factory f= new Factory("Production department is creating",
               "Marketing department is creating\n");
        f.getInfo();

        System.out.println("-------------------------------");
        Vehicle v=new Vehicle("Production department is creating",
               "Marketing department is creating",
                "Hatchback car is creating",
                "Coupe car is creating");
        
        v.getInfo();
        System.out.println("-------------------------------");
         ElectronicParts ep=new ElectronicParts("Production department is creating",
               "Marketing department is creating",
                "Hatchback car is creating",
                "Coupe car is creating","Electronic part is creating");
        
        ep.getInfo();
        System.out.println("-------------------------------");
        MechanicalParts mp=new MechanicalParts("Production department is creating",
               "Marketing department is creating",
                "Hatchback car is creating",
                "Coupe car is creating","Mechanical part is creating");
        
        mp.getInfo();
        
    }
    
}
