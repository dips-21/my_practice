package assignments;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int Roll_No;
    private String Name;
    private int Age;
    private float Fees;
    private static int count = 0;

    public Student(int roll_No, String name, int age, float fees) {
        Roll_No = 1+count++;
        Name = name;
        Age = age;
        Fees = fees;
    }
    public Student(){
        this(33,"Deepali",26,600000);
    }


    public int getRoll_No() {
        return Roll_No;
    }

    public void setRoll_No(int roll_No) {
        Roll_No = roll_No;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public float getFees() {
        return Fees;
    }

    public void setFees(float fees) {
        Fees = fees;
    }

    public String toString(){
        return String.format("Roll_No : %d, Name: %s, Age : %d,Fees:%.2f", Roll_No, Name, Age,Fees);
    }
}
class College{
    List<Student> studentArrayList =new ArrayList<Student>();
   public void addStudent(Student student){
       studentArrayList.add(student);
       System.out.println("Student added "+student);
   }
   public void removeStudent(int index){
       removeStudent(index);
   }
   public  void PrintStudent(){
       for(Student s1: studentArrayList){
           System.out.println(s1);
       }
   }
}

public class StudentList{
    public static void main(String[]args){
        College c=new College();
        Student s1=new Student(1,"Jaanhvi",26,30000);
        Student s2= new Student(2,"Mishti",27,40000);
        Student s3=new Student(3,"Minakshi",28,500000);
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        c.PrintStudent();
    }
}