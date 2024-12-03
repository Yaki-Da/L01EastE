package Lvl_I.Lesson_5;
public class Homework5 {
    public static void main(String[] args) {
        BankAccount BaseData = new BankAccount();
        BaseData.id = 1;
        BaseData.name = "Mike";
        BaseData.surname = "Jonson";
        BaseData.deposite = 10000.0;
        BaseData.showinfo();
        BaseData.UpDeposite(500);
        BaseData.showinfo();
        BaseData.DownDeposite(200);
        BaseData.showinfo();
        Student StudentTest = new Student();
        StudentTest.id_ticket = 1;
        StudentTest.name = "Иван";
        StudentTest.surname = "Иванович";
        StudentTest.score_mat = 3;
        StudentTest.score_eco = 5;
        StudentTest.score_lng = 3;
        StudentTest.mid_score();
        Employee e1 = new Employee(1, "Рустам", "Стокгольм", (byte) 36, 45000);
        Employee e2 = new Employee(2, "Заур", "Париж", (byte) 37, 72000);
        e1.x2salary();e2.x2salary();}}