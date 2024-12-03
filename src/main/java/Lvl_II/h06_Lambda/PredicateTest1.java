package Lvl_II.h06_Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Niko", 'm', 28, 2, 6.4);
        Student st3 = new Student("Anna", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mary", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentPredicate info = new StudentPredicate();
        Predicate<Student> p1 = student -> student.sex == 'm';
        Predicate<Student> p2 = student -> student.age >= 22;
        Predicate<Student> x = student -> student.avgGrade >= 6.4;
        // and, or, negate
        info.testStudents(students, p1.and(p2).and(x));
    }
}
class StudentPredicate {
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}