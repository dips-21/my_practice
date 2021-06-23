package college;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Grad("dips",1,25,"Pune");
        Student student1=new UnderGrad("Sanjana",1,25,"Pune");
        System.out.println(student.isPassed(87));
        System.out.println(student1.isPassed(65));

        }
    }
