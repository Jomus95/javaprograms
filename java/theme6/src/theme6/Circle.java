package theme6;

public class Circle implements GeometricObject {

    protected double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
