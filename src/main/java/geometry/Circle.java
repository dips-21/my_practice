package geometry;

public class Circle extends Shape{
        private double radius;

        public Circle(double rr){

            radius = rr;
            System.out.println("Circle Shape Object Created");
        }

        public Circle(){
            this(30);
        }

        public double getLRadius(){return radius;}

        public void setRadius(double rr){radius= rr;}

        public double getArea(){
            return 3.14 * radius * radius;
        }
    }
