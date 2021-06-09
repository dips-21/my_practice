package coreJava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

    @Test
    public void compareTo() {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("dipali",24,5.6f,35));
        studentList.add(new Student("ripali",24,5.6f,35));
        studentList.add(new Student("aipali",24,5.6f,35));
        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);
    }


    @Test
    public void comparator() {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("dipali",24,5.6f,35));
        studentList.add(new Student("ripali",14,5.6f,35));
        studentList.add(new Student("aipali",28,5.6f,35));
        System.out.println(studentList);
        AgeComparator comparartor=new AgeComparator();
      //  Collections.sort(studentList,comparartor);
      // System.out.println(studentList);
      int res=  studentList.get(0).compareTo(studentList.get(1));
        System.out.println("result "+res);
        System.out.println("comp res "+ comparartor.compare(studentList.get(0),studentList.get(1)));
        System.out.println("i = "+Integer.compare(8,98));
    }




}