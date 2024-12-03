package Lvl_I.Lesson_16;
public class Email {
    String email;
    public Email(String email) {
        this.email = email;
    }
    public void GetEmail(){
        int a=0;
        int b=0;
        int c=0;
        while (email.substring(a, email.length()).indexOf(';') >= 0) {
            a = email.substring(a, email.length()).indexOf('@') + a + 1;
            b = email.substring(a, email.length()).indexOf(';') + a + 1;
            c = email.substring(a, b).lastIndexOf('.') + a;
            if ((a+1) >= email.length()) break;
            System.out.println(email.substring(a, c));
            a = email.substring(a, email.length()).indexOf(';') + a;
        }
    }
}