package met;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String title;
    List<Student> studentList = new ArrayList<>();

    String getTitle() {
        return title;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void printStudentList() {
        for (Student student:studentList) {
            System.out.println(student);
        }
    }
}
