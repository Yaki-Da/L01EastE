package Lvl_I.Lesson_5;
public class BankAccount {
    int id;
    String name, surname;
    double deposite;
    double UpDeposite (double up) {return deposite += up;}
    double DownDeposite (double down) {return deposite -= down;}
    void showinfo() {System.out.println("Абонент - "+name+" "+surname+"\n"+"На счету - "+deposite+"$");}}