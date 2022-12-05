package ss06.exercise.bai4;

public class Triangle extends Shape{
    private double side1,side2,side3 = 1.0;
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double p = (side1+side2+side3)/2;
        double area1 =Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return area1;
    }

    public double getPerimeter()
    {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", area=" + getArea() +
                '}';
    }
}
