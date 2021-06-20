package exam;

public class Students {
    private int Id;
    private Date DOB;
    private int marks;


    public Students(int id, Date DOB, int marks) {
        Id = id;
        this.DOB = DOB;
        this.marks = marks;
    }


    public int getId() {
        return Id;
    }

    public Date getDOB() {
        return DOB;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Id=" + Id +
                ", DOB=" + DOB +
                ", marks=" + marks +
                '}';
    }
}
