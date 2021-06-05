package geometry;

public class Rectangle extends Shape {
        private double length;
        private double breadth;

        public Rectangle(double ll,double bb){

            length =ll;
            breadth = bb;
            System.out.println("Rectangular Shape Object Created");
        }

        public Rectangle(){
            this(20,10);
        }

        public double getLength(){return length;}

        public void setLength(double ll){length = ll;}

        public double getBreadth(){return breadth;}

        public void setBreadth(double bb){breadth = bb;}

        public double getArea(){
            return length * breadth;
        }

    }
