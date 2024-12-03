package Lvl_I.Lesson_5;

public class Student {
    int id_ticket;
    String name, surname;
    short year_study;
    byte score_mat, score_eco, score_lng;
    void mid_score () {
        System.out.println("Сред.балл/оценка " + name + " " + surname + " = " + (float) (score_mat + score_eco + score_lng) / 3);
    }
}
