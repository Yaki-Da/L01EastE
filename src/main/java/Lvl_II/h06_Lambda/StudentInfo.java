package Lvl_II.h06_Lambda;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}
// Вариант 1
//        System.out.println("------------------------------");
//        info.printStudentOverGrade(students, 7.4);
//        System.out.println("------------------------------");
//        info.printStudentUnderAge(students, 30);
//        System.out.println("------------------------------");
//        info.printStudentMixCondition(students,20,9.5,'f');
//    void printStudentOverGrade (ArrayList<Student> al, double grade){
//        for (Student s: al)
//                if (s.avgGrade>grade)
//                    System.out.println("printStudentOverGrade : " + s);
//    }
//    void printStudentUnderAge (ArrayList<Student> al, int age){
//        for (Student s: al)
//            if (s.age<age)
//                System.out.println("printStudentUnderAge : " + s);
//    }
//    void printStudentMixCondition (ArrayList<Student> al, int age, double grade, char sex){
//        for (Student s: al)
//            if (s.age>grade && s.avgGrade<grade && s.sex==sex)
//                System.out.println("printStudentMixCondition : " + s);
//    }

interface StudentChecks {
    boolean check(Student s);
}
// Вариант 2
//class CheckOverGrade implements StudentChecks{
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade>8;
//    }
//}