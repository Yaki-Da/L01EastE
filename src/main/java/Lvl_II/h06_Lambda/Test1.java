package Lvl_II.h06_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Test1 {
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
        StudentInfo info = new StudentInfo();
// Для сортировки используя коллектионс
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course-o2.course;
            }
        });
// Для сортировки используя коллектионс и лямбда)
        Collections.sort(students, (stest1,stest2) -> stest1.course-stest2.course);
        System.out.println(students);
// Вариант 2
//        info.testStudents(students, new CheckOverGrade());
// Вариант 3
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });
// Вариант 4 (полное описание выражения)
        info.testStudents(students, (Student s) -> {
            return s.age < 30;
        });
        System.out.println("-----------------------------------------------------------");
        info.testStudents(students, (Student s) -> {
            return s.avgGrade > 8;
        });
        System.out.println("-----------------------------------------------------------");
        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
        });
// Вариант 5 (короткое описание выражения) <параметры тела> -> <тело метода>
        info.testStudents(students, s -> s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f');
    }
}
