package exam;

public class DateTest {
    public static void main(String[] args){
        int[] m={50,60};
        Students student=new Students(1,new Date(1,2,2020),m);
        System.out.println(student);
        student.getMarks();
        Students student1=new Students(2,new Date(31,3,2020),new int[]{80,90});
        System.out.println(student1);
        try{
        Students student2=new Students(3,new Date(1,13,2020),m);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}