package Lvl_I.Lesson_30;
import java.util.ArrayList;
import java.util.function.Predicate;
class TestEmployee {
    void printEmployee(Employee emp) {
        System.out.println("*Имя = " + emp.name + " *Отделение = " + emp.department + " *Зарплата = " + emp.salary);
    }
    void filterWorkers(ArrayList<Employee> aLEmp, Predicate<Employee> pDEmp) {
        for (Employee xEmp : aLEmp) {
            if (pDEmp.test(xEmp)) {
                printEmployee(xEmp);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Employee> aLEmp = new ArrayList<>();
        Employee a01 = new Employee("Андрей", "ХИА", 150000);
        Employee a02 = new Employee("Сергей", "ПУА", 190000);
        Employee a03 = new Employee("Радион", "ПУА", 180000);
        Employee a04 = new Employee("Петр", "ХИА", 155000);
        Employee a05 = new Employee("Иван", "Иван", 145000);
        Employee a06 = new Employee("Василий", "ССМ", 210000);
        Employee a07 = new Employee("Алексей", "ССМ", 255000);
        Employee a08 = new Employee("Михаил", "ССМ", 165000);
        Employee a09 = new Employee("Семен", "ПУА", 275000);
        Employee a10 = new Employee("Борис", "ХИА", 350000);
        aLEmp.add(a01);
        aLEmp.add(a02);
        aLEmp.add(a03);
        aLEmp.add(a04);
        aLEmp.add(a05);
        aLEmp.add(a06);
        aLEmp.add(a07);
        aLEmp.add(a08);
        aLEmp.add(a09);
        aLEmp.add(a10);
        TestEmployee testEmployee = new TestEmployee();
        System.out.println("---Условие 1: з/п от 200000, в отделе ССМ");
        testEmployee.filterWorkers(aLEmp, a -> a.salary >= 200000 && a.department.equals("ССМ"));
        System.out.println("---Условие 2: Имя начинается с буквы А, з/п не выше 180000");
        testEmployee.filterWorkers(aLEmp, a -> a.salary <= 180000 && a.name.startsWith("А"));
        System.out.println("---Условие 3: Имя начинается с буквы А, з/п не выше 180000");
        testEmployee.filterWorkers(aLEmp, a -> a.name.equals(a.department));
    }
}