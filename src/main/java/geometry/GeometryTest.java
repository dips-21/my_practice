package geometry;

public class GeometryTest{
        public static void main(String[] args){
            Circle cs = new Circle();
            Circle cs1 = new Circle(34);

            Rectangle rs = new Rectangle();
            Rectangle rs1 = new Rectangle(4 ,6);

            System.out.printf("Area of first Circle is %.2f%n",cs.getArea());
            System.out.printf("Area of second Circle is %.2f%n",cs1.getArea());

            System.out.printf("Area of first Rectangle is %.2f%n",rs.getArea());
            System.out.printf("Area of Second Rectangle is %.2f%n",rs1.getArea());
        }
    }
