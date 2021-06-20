package exam;

public class DateTest {
    public static void main(String[] args){
        Students student=new Students(1,new Date(1,2,2020),89);
        System.out.println(student);
        try{
        Students student1=new Students(1,new Date(1,13,2020),89);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}