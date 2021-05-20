
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MERT
 */
public class Student<E> extends ArrayList<E> {

    E examGrade; 
//    ArrayList<E> alist = new ArrayList<String>();
    Student<E> next; 
    Student<E> studentName;
    
    @SuppressWarnings("unused")
    Student(E element) {
        this.examGrade = element;
        
    }

    

    
}
