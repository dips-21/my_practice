package coreJava.oops;

import exam.Students;

public class Constructor {

}

class Student {
    String name;
    int rollNo;
    String schoolName;
    Student friend;

    public Student(String name, int rollNo, String schoolName) {
        this.name = name;
        this.rollNo = rollNo;
        this.schoolName = schoolName;
    }


    public Student(Student student) {
        this.name = student.name;
        schoolName = student.schoolName;
        this.friend = student.friend;  //shallow copy

    }
    //Dipali     dips
    // Sipali  dips

    public Student(String name, int rollNo, String schoolName, Student friend) {
        this(name, rollNo, schoolName);
        this.friend = friend;
    }
    public Student() {
        System.out.println("default constructor");
    }

    public static void main(String[] args) {
        Student student = new Student("dipali",1,"xyz");
        System.out.println(student);

        Student dips=new Student("rohini",2,"efg");
        Student rohini=new Student("rohini",3,"efg",dips);
       // Student hitler=new Student("hitler",4,"efg",dips);
        Student hitler=new Student(rohini);
        System.out.println(hitler.friend.rollNo);
        rohini.friend.rollNo=90;
        System.out.println(rohini.friend.rollNo);
        System.out.println(hitler.friend.rollNo);
    }


}

