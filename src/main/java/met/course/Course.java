package met.course;
import java.util.ArrayList;
import java.util.List;

public class Course {
    String title;
    List<Student> studentList = new ArrayList<>();

    public Course(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addStudent(String name, int age, int marks) {
        Student student = new Student(name, age, marks);
        studentList.add(student);
    }

    public void remove(Student student) {
        studentList.remove(student);
    }

    public void printStudentList() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
