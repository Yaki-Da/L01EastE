package Lvl_I.Lesson_4;
class Student {
    int id_ticket;
    String name;
    String surname;
    short year_study;
    byte score_mat, score_eco, score_lng;
}
public class StudentTest {
    public static void main(String[] arg) {
        float res;
        Student o1 = new Student ();
        o1.id_ticket = 1;
        o1.name = "Kriss";
        o1.surname = "Panzer";
        o1.year_study = 1997;
        o1.score_mat = 4;
        o1.score_eco = 4;
        o1.score_lng = 4;
        Student o2 = new Student ();
        o2.id_ticket = 2;
        o2.name = "Roland";
        o2.surname = "Phifer";
        o2.year_study = 1995;
        o2.score_mat = 5;
        o2.score_eco = 5;
        o2.score_lng = 3;
        Student o3 = new Student ();
        o3.id_ticket = 3;
        o3.name = "Jon";
        o3.surname = "Slavicov";
        o3.year_study = 1996;
        o3.score_mat = 3;
        o3.score_eco = 3;
        o3.score_lng = 4;
        res=(o1.score_mat+o1.score_eco+o1.score_lng)/3f;
        System.out.println ("Средняя оценка по 3-м предметам "+o1.name+" "+o1.surname+" "+o1.year_study+" = "+res);
        res=(o2.score_mat+o2.score_eco+o2.score_lng)/3f;
        System.out.println ("Средняя оценка по 3-м предметам "+o2.name+" "+o2.surname+" "+o2.year_study+" = "+res);
        res=(o3.score_mat+o3.score_eco+o3.score_lng)/3f;
        System.out.println ("Средняя оценка по 3-м предметам "+o3.name+" "+o3.surname+" "+o3.year_study+" = "+res);
    }
}
