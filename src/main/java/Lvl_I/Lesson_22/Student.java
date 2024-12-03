package Lvl_I.Lesson_22;

public class Student {
    private StringBuilder name;
    private byte course, grade;
    public void showInfo() {
        System.out.println("Имя = < " + getName() + " >");
        System.out.println("Курс = < " + getCourse() + " >");
        System.out.println("Оценка = < " + getGrade() + " >");
    }
    public StringBuilder getName() {
        return name;
    }
    public byte getCourse(){
        return course;
    }
    public byte getGrade() {
        return grade;
    }
    public void setName(StringBuilder alfa) {
        if (alfa.length()>=3) name = alfa;
    }
    public void setCourse(byte beta){
        if ((beta>=1)&&(beta<=4)) course = beta;
    }
    public void setGrade(byte omega) {
        if ((omega>=1)&&(omega<=10)) grade = omega;
    }
}
