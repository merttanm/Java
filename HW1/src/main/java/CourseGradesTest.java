

/**
 *
 * @author MERT
 */
import java.util.ArrayList;
import java.util.Random;

public class CourseGradesTest {

    final int maxGrades = 100;
    Random random = new Random();
    CourseGrades<Integer> mySinglyLinkedList;

    public CourseGradesTest() {
        printName();
    }

    public void printName() {
        mySinglyLinkedList = new CourseGrades<Integer>();
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Ali");
        alist.add("Veli");
        alist.add("Musa");
        alist.add("Numan");
        alist.add("Mehmet");
        alist.add("Serkan");
        alist.add("Yasin");
        alist.add("Derin");
        alist.add("Ayşe");
        alist.add("Fatma");
        alist.add("Güllü");
        alist.add("Bergen");
        alist.add("Gaye");
        alist.add("Mert");
        alist.add("Özge");
        alist.add("Berkay");
        alist.add("Tuğba");
        int i;
        int size = 15;
        int value = 0;
        for (i = 0; i < size; i++) {
            value = random.nextInt(maxGrades);
           
            if (value < 60) {
                mySinglyLinkedList.add(value);
                System.out.println(alist.get(i) +"  Harf notu F  " + value);

            } else if (value <=60 && value <75 ) {
                mySinglyLinkedList.add(value);
                System.out.println(alist.get(i) +"  Harf notu C  " + value);

            }
            else if (value <=75 && value <90) {
                mySinglyLinkedList.add(value);
                System.out.println(alist.get(i) +"  Harf notu B  " + value);

            }
            else {
                mySinglyLinkedList.add(value);
                System.out.println(alist.get(i) +"  Harf notu A  " + value);
            }
            
        } 
        System.out.println();
        mySinglyLinkedList.display();
        System.out.println();

    }


    public static void main(String[] args) {
        CourseGradesTest mySinglyLinkedListTest = new CourseGradesTest();
    
    }
}
