package PractiseOops.Test;
import java.util.*;
public class Student {
    String name;
    int rollno;
    float marks;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
        }
    public void getGrade(int m){
        if(m>=90){
            System.out.println(name+" got "+m+" and A Grade");
        } else if (m>=75&&m<=89) {
            System.out.println(name+" got "+m+"andB Grade");
        } else if (m>60&&m<=74) {
            System.out.println(name+" got "+m+" and C Grade");
        } else {
            System.out.println(name+" got "+m+" and D Grade");
        }

    }
}
class Main{
    public static void main(String[] args) {
        Student s1=new Student("NikhilReddy",61);
        s1.getGrade(95);
        Student s2=new Student("Vivek",62);
        s2.getGrade(63);
        Student s3=new Student("Uppi",63);
        s3.getGrade(49);

    }
}
