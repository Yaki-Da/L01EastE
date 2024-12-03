package Lvl_I.Lesson_5;
public class Employee {
    public Employee(int a1, String a2, String a3, byte a4, float a5) {
        id=a1;surname=a2;Departament=a3;age=a4;salary=a5;getid=id;getsalary=salary;}
    int id;
    public String surname;
    String Departament;
    byte age;
    private float salary;
    public float getsalary;
    public int getid;
    void x2salary () {
        System.out.print(surname+" = "+salary+" а теперь стало = ");salary*=2;System.out.println(salary);
    }
}
