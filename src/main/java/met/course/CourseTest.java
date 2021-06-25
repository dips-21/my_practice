package met.course;
import met.course.Course;
import met.course.Student;

public class CourseTest {
    public static void main(String[] args) {
        Student[] students = {new Student("Mishti", "ABC", "DIPS", 25, "A", 89),
                new Student("Dips", "DEF", "DIPS", 23, "B", 60),
                new Student("jaanhvi", "kmh", "DIPS", 23, "B", 60),
                new Student("renuka", "mno", "DIPS", 23, "B", 60)
        };

        Course dacCourse = new Course("DAC");

        for (Student student : students) {
            dacCourse.addStudent(student);
        }

        dacCourse.printStudentList();
        System.out.println(dacCourse.title);
        System.out.println();


        Course matricCourse = new Course("matric");
        System.out.println(matricCourse.title);
        matricCourse.addStudent(students[0]);
        matricCourse.addStudent(students[2]);
        matricCourse.printStudentList();
        System.out.println();
        matricCourse.addStudent("Sayalee", 21, 78);
        matricCourse.printStudentList();
        System.out.println();


        Course dbmsCourse = new Course("dbms");
        System.out.println(dbmsCourse.title);
        dbmsCourse.addStudent(students[3]);
        dbmsCourse.printStudentList();
    }
}