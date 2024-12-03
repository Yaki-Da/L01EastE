package Lvl_I.Lesson_29;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class HomeWork29 {
    static void smena(LocalDateTime ldtA, LocalDateTime ldtB, Period pR, Duration dR) {
        DateTimeFormatter dtfA = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! HH:mm");
        DateTimeFormatter dtfB = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/yy");
        if (ldtA.isBefore(ldtB)) {
            System.out.println("Работаем с: " + ldtA.format(dtfA));
            ldtA = ldtA.plus(pR);
            System.out.println("До: " + ldtA.format(dtfA));
            System.out.println("Отдыхаем с: " + ldtA.format(dtfB));
            ldtA = ldtA.plus(dR);
            System.out.println("До: " + ldtA.format(dtfB));
        } else {
            System.out.println("Дата должна соответствовать 1 раньше 2 позже!");
        }
    }
    public static void main (String[]args) {
        LocalDateTime A1 = LocalDateTime.of(2011,3,22,8,0);
        LocalDateTime A2 = LocalDateTime.of(2011,5,1,8,0);
        Period p1 = Period.of(0,0,1);
        Duration d1 = Duration.ofHours(2);
        smena(A1,A2,p1,d1);
    }
}
