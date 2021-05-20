
import java.util.ArrayList;

/**
 *
 * @author MERT
 */
public class CourseGrades<E> {

    private Student<E> header = new Student<E>(null);
    private int size = 0;
    private ArrayList<E> myArray = new ArrayList<>(size);

    public CourseGrades() {

    }

    public void addname(E n) {
        Student temp = header;
        temp.next = new Student(n);
        size++;
        myArray.add((E) "ASD");

    }

    public void add(E e) {
        Student temp = header;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Student(e);
        size++;

    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Add not element" + index);
        } else {
            Student tmp = header;
            int counter = 0;
            while (tmp != null) {
                if (index == counter) {
                    Student entry = new Student(e);
                    Student back = tmp.next;
                    tmp.next = entry;
                    entry.next = back;
                    size++;
                }
                tmp = tmp.next;
                counter++;
            }
        }
    }

    public E get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Add not element" + index);
        } else {
            Student tmp = header.next;
            int counter = 0;
            while (tmp != null) {
                if (counter == index) {
                    return (E) tmp.examGrade;
                }
                tmp = tmp.next;
                counter++;
            }
        }
        return null;
    }

    public void display() {
        Student tmp = header.next;
        while (tmp != null) {
            System.out.print(tmp.examGrade + " ");
            tmp = tmp.next;
            

        }
    }
}
