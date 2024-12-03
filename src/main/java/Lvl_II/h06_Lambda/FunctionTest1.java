package Lvl_II.h06_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest1 {
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

        Function<Student,Double> f = student -> 3.14;

        double res = avgOfSmth(students,stud -> stud.avgGrade);
        System.out.println("Среднее арифметическое значение: " + res);
        System.out.println("Средний возвраст студентов     : " + avgOfSmth(students,stud -> (double)stud.age));
    }
    private static double avgOfSmth(List<Student> list, Function<Student, Double> f){
        double result = 0;
        for(Student st: list){
            result+=f.apply(st);
        }
        result = result / list.size();
        return result;
    }
}
