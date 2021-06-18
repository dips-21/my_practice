package met;

class Student{
    private  String name;
        private String code;
        private String password;
        private int age;
        private String grade;
        private double marks;

        public Student(String name, String code, String password, int age, String grade, float marks) {
            this.name=name;
            this.code = code;
            this.password = password;
            this.age = age;
            this.grade = grade;
            this.marks=marks;
        }
        public  Student (String name,int age,float marks){
            this(name,"null","null",age,null,marks);
        }

        public String getName(){return name;}
        public String getCode(){return code;}
        public void setCode(String code) { code = code;}
        public String getPassword(){return password;}
        public void setPassword(String password){password=password;}
         public double getMarks(){return marks;}
         public  void setMarks(float marks){marks=marks;}

         int getAge() { return age; }

        void setAge(int age) { age = age; }

        String getGrade() { return grade; }

        void setGrade() { grade=grade; }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", marks=" + marks +
                '}';
    }
}

