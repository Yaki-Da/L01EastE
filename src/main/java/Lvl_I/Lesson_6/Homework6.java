package Lvl_I.Lesson_6;
class Student {
    Student (int a1,String a2, String a3, short a4, byte a51, byte a52, byte a53) {
        id_ticket=a1;name=a2;surname=a3;year_study=a4;s_m=a51;s_e=a52;s_l=a53;
        System.out.print(id_ticket+" "+name+" "+surname+" с "+year_study+" мат_"+s_m+" эко_"+s_e+" ино_"+s_l+"\n");}
    Student (int a1,String a2, String a3, short a4)
        {this(a1,a2,a3,a4,(byte)0,(byte)0,(byte)0);}
    Student () {this(0,null,null,(short)0,(byte)0,(byte)0,(byte)0);}
    int id_ticket;
    String name, surname;
    short year_study;
    byte s_m, s_e, s_l;}
class sumtools {
    int x=0;
    int sum (int s1, int s2, int s3, int s4) {return s1+s2+s3+s4;}
    int sum (int s1, int s2, int s3) {return sum (s1, s2, s3, 0);}
    int sum (int s1, int s2) {return sum (s1, s2, 0, 0);}
    int sum (int s1) {return sum (s1, 0, 0, 0);}
    int sum () {return sum (0, 0, 0, 0);}}
public class Homework6 {
    public static void main(String[] arg) {
    sumtools csum = new sumtools();
    System.out.println(csum.sum(5,2,3,10));
    System.out.println(csum.sum(5,2,3));
    System.out.println(csum.sum(5,2));
    System.out.println(csum.sum(5));
    System.out.println(csum.sum());
    Student Test1 = new Student (1,"Shamil","Gadzhiev",(short)2003,(byte)5,(byte)3,(byte)3);
    Student Test2 = new Student (2,"Shamil","Gadzhiev",(short)2003);
    Student Test3 = new Student ();}}